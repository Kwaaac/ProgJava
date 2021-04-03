package exo2et3;

import exo1.Book;

        /*
        1.
        Le code affiche True et False, simplement car l'égalité "==" représente l'égalité par Référence et non par
        contenu.

        2.
        Pour tester si deux objects ont le même contenu, il faut utiliser la méthode equals

        4.
        Il faut override la méthode ToString().

        6.
        L'annotation Override permet de redéfinir une méthode déjà éxistante par une nouvelle définition plus adapté
        pour le sous-type écrit.
         */

public class MainExo2 {
    public static void main(String[] args) {
        var b1 = new Book("Da Java Code", "Duke Brown");
        var b2 = b1;
        var b3 = new Book("Da Java Code", "Duke Brown");

        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));


        System.out.println();

        System.out.println(b1.isFromTheSameAuthor(b2));
        System.out.println(b1.isFromTheSameAuthor(b3));

        System.out.println(b1);
    }
}
