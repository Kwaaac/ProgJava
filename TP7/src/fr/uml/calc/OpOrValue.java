package fr.uml.calc;

import static java.util.Objects.requireNonNull;


public record OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
    public static final int OP_NONE = 0;
    public static final int OP_ADD = 1;
    public static final int OP_SUB = 2;

    /* Les constructeur sont pas incroyables parce que le premier ne fait aucune vérification
     * et il n'y a que le second qui fait des vérifications */
    public OpOrValue(int value) {
        this(OP_NONE, value, null, null);
    }

    public OpOrValue(int operator, OpOrValue left, OpOrValue right) {
        this(operator, 0, left, right);
        requireNonNull(left);
        requireNonNull(right);
        if (operator != OP_ADD && operator != OP_SUB) {
            throw new IllegalArgumentException("bad operator");
        }
    }

    public int eval() {
        return switch (operator) {
            case OP_ADD -> left.eval() + right.eval();
            case OP_SUB -> left.eval() - right.eval();
            // case OP_NONE:
            default -> value;
        };
    }

    public static void main(String[] args) {
        OpOrValue expression = new OpOrValue(OP_ADD,
                new OpOrValue(2),
                new OpOrValue(3)
        );
        System.out.println(expression.eval());
    }
}
