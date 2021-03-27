package exo2;

import java.util.Scanner;

public class Main_exo2 {

    private static void q1() {
        var s8 = "hello";
        // La méthode toUpperCase() renvoie la chaine de caratère convertie en majuscule
        // De plus les String sont immutable donc une méthode ne peux pas le modifier
        s8 = s8.toUpperCase();
        System.out.println(s8);
    }

    private static void q2() {
        var scan = new Scanner(System.in);
        System.out.println(Stars.printStarts(scan.nextInt()));
        scan.close();
    }

    private static void q2_bis() {
        var scan = new Scanner(System.in);
        System.out.println(Stars.printStartsSB(scan.nextInt()));
        scan.close();
    }

    public static void main(String[] args) {
        // q1();
        // q2();
        // q2_bis();

        /*
        Question 5:
        Le miracle technologique se nomme le "chaining", il va permettre
        de ne pas rappeller la variable à chaque appel de méthodes et permet
        alors une syntaxe plus légère que le code précédent.
        Pour cela il faut que les méthodes appellées renvoie l'object en question
        (return this;).
         */
    }
}
