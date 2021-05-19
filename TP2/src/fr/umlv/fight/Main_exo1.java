package fr.umlv.fight;

public class Main_exo1 {

    private static void q1() {
        // Type Pixel sur un var
        // Le compilateur sait qu'il existe une méthode resert() sur P car le
        // compilateur interprete que var prend le Type Pixel avec le constructeur
        var p = new Pixel(2, 5);
        p.printOnScreen();
        p.reset();
        p.printOnScreen();
    }

    private static void q2() {

        var p1 = new Pixel(3, 2);
        var p2 = p1;
        var p3 = new Pixel(3, 4);
        var p4 = new Pixel(3, 2);

        System.out.println(p1 == p2); // true - Les références de p1 et p2 sont les mêmes
        System.out.println(p1 == p3); // false - Les références de p1 et p3 sont différentes
        System.out.println(p1 == p4); // false - Les références de p1 et p4 sont différentes
    }

    private static void q2_bis() {
        var p1 = new Point(3, 2);
        var p2 = p1;
        var p3 = new Point(3, 4);
        var p4 = new Point(3, 2);

        // "==" prend l'égalité primitive et cherche l'égalité entre les références et non les valeurs
        // (Note: sur les object, pour les types primitifs, il cherche l'égalité des valeurs)
        // Donc même résultat avec Point
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1 == p4);
    }

    private static void q3() {
        var s4 = "toto";
        var s5 = new String(s4);

        // La méthode "equals"
        System.out.println(s4.equals(s5) ? "Les chaines sont égales" : "Les chaines ne sont pas égales");
    }

    private static void q4() {
        var p4 = new Point(1, 2);
        var p5 = new Point(1, 2);
        System.out.println(p4.equals(p5)); // L'instance p4 est égale à l'instance p5, les valeurs sont les mêmes
        var q1 = new Pixel(1, 2);
        var q2 = new Pixel(1, 2);
        System.out.println(q1.equals(q2)); // La méthode équals n'est pas définie
        // pour le Type Pixel la méthode d'Object ne permet pas de vérifier leur égalité correctement

        /*
        On peut appeller la méthode equals car elle est Override dans les Records et donc utilisable et pour Pixel,
         c'est le equals de Object qui est utilisé
         */
    }


    public static void main(String[] args) {
        // q1();
        // q2();
        // q2_bis();
        // q3();
        q4();
    }
}
