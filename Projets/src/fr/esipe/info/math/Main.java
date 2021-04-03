package fr.esipe.info.math;

public class Main {

    public static void main(String[] args) {
        var A = new Matrice(new long[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 11}});

        var test = new Matrice(new long[][]{{2, -1, 0}, {-1, 2, -1}, {0, -1, 2}});
        var bob = new Matrice(new long[][] { {2, 1}, {1, 1} });
        System.out.println(bob.inverse());

        System.out.println(A);
        System.out.println(A.identity());

        System.out.println(A.maxInColumn(0));
        A.swapRows(1, 2);
        System.out.println(A.maxInColumn(0));
        A.transvection(0, 0, new Rational(2));
        System.out.println(A);
        System.out.println(A.transpose());
        var B = A.times(A.transpose());
        System.out.println(B);
        var D = A.transpose().times(A);
        try {
            var E = D.inverse();
            System.out.println(E);
        } catch (ArithmeticException e) {
            System.out.println("D n'a pas d'inverse");
        }
    }

}
