package fr.uml.calc;

import java.util.Iterator;

public sealed interface Expr {
    int eval();

    sealed interface BinOp extends Expr {

        Expr leftValue();

        Expr rightValue();

        int compute(int x, int y);

        @Override
        default int eval() {
            return compute(leftValue().eval(), rightValue().eval());
        }

        final record Add(Expr leftValue, Expr rightValue) implements BinOp {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }

            @Override
            public String toString() {
                return "(" + leftValue + " - " + rightValue + ")";
            }
        }

        final record Sub(Expr leftValue, Expr rightValue) implements BinOp {
            @Override
            public int compute(int x, int y) {
                return x - y;
            }

            @Override
            public String toString() {
                return "(" + leftValue + " - " + rightValue + ")";
            }
        }
    }

    static Expr parse(Iterator<String> scanner) {

        var node = scanner.next();
        return switch (node) {
            case "-" -> new BinOp.Sub(parse(scanner), parse(scanner));
            case "+" -> new BinOp.Add(parse(scanner), parse(scanner));

            default -> new Value(Integer.parseInt(node));
        };

    }

    final record Value(int value) implements Expr {
        @Override
        public int eval() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

