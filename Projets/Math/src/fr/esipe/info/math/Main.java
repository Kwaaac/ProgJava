package fr.esipe.info.math;

public class Main {

    public static void main(String[] args) {
        Matrice m3 = new Matrice(new long[][] { { 1, 2, 1 }, { 10, 5, 4 }, { 20, 6, 2} });
        System.out.println(m3);
        System.out.println(m3.resoud(new Matrice(new long[][] {{ 10 }, { 67 }, { 104 }})));


        Matrice A = new Matrice(new long[][] { {1,1,1}, { 3, 2 , 1 }, { 4, 5, 2 } });

        System.out.println(A.inverse());

        System.out.println(A.resoud(new Matrice(new long[][] { {50}, { 120 }, { 160 } })));


        var testi = new Matrice(new long[][]{{1, -1, 2}, {3, 2, 1}, {2, -3, -2}});
        var b = new Matrice(new long[][]{{5}, {10}, {-10}});

        System.out.println(testi.resoud(b));

    }
}
