package exo2;

public class Test {

    public static void main(String[] args) {
        var first = args[0];
        var second = args[1];
        var last = args[2];
        System.out.println(first + ' ' + second + ' ' + last);

        /*
         * On peut utiliser ' ' à la place de " " car nous avons un String à
         * gauche de l'opérateur. Le compilateur sait alors qu'il va falloir
         * concatener avec une chaîne de caractère.
         */

        /* De cette manière, le compilateur va compiler en utilisant un String builder de lui même !  */

        /*
         * Question 7:
         * Il va me faire les gros yeux simplement parce que ça annulerai completement l'intéret d'utiliser
         * StringBuilder. La méthode append est là pour ça. Le "+" recréer une instance de String à chaque fois
         * Il ne faut pas être fou non plus.
         *
         * Question 8:
         * Lors de "petite" concattenation dans le genre de notre main, utiliser l'un ou l'autre ne pose aucun problème
         * car le compilateur va le changer en string builder pour qu'il soit moins complexe.
         *
         * Cependant, lors de boucles, le compilateur ne va pas utiliser String builder et va recréer des instance à chaque fois.
         * Donc lorsque nous devons boucler une concatenation, String builder est alors bien plus adapté.
         *
         */
    }
}
