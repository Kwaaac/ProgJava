package exo1;

public class Main {
    private int foo;

    public int getFoo() {
        return foo;
    }

    public void setFoo(int foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        System.out.println("Hello Eclipse");
        /*
        1. Que fait sysout + Ctrl + Space dans un main ?
            Ça auto-complete la méthode System.out.println()

        2. Que fait toStr + Ctrl + Space dans une classe ?
           Ça auto-complete la méthode toString()

        3. Définir un champs foo de type int, que fait get + Ctrl + Space, et set + Ctrl + Space
            Ça auto-complete le getter et le setter de la variable foo

        4. Dans le menu Source, comment générer un constructeur initialisant le champ foo ?
            Cliquer sur Source puis "Generate Constructor()..."

        5. Sélectionner le nom de la classe puis Alt + Shift + R, qu'obtient-on ? Même question avec le champ foo .
            On obtient un refractor sur le nom de la classe (et du fichier), même chose avec la variable
            ça recherche et remplace toutes les occurences de ce qu'on selectionne.

        6. Écrire a = 2 + 3 + 4, puis sélectionner 2 + 3 puis Alt + Shift + L .
            var i = 2 + 3;
            var a = i + 4;
            Cela extrait le 2 + 3 pour le mettre dans une variable locale

        7. Écrire new Integer(2), en gardant le curseur après ')', appuyer sur Ctrl + 1, que se passe-t-il ?
            Déjà écrire new Integer(2), c'est apriori deprecated donc pas bon ! :p
            Le Ctrl + 1 sort le "Quick Fix" d'Eclipse pour proposer une amélioration ou correction
            de ce que nous venons d'écrire. Ici il nous propose de rajouter une variable.


        8. Déclarer une variable s de type String et cliquer sur String en maintenant la touche Ctrl . Que se passe-t-il ?
            Nous ouvrons la classe String. On peut donc voir les méthodes, la Jdoc de la classe.

        9. Dans la méthode toString(), que fait un Ctrl + Clic sur super.toString() ?
            Nous onvrons la classe Object, et nous somme directement amener sur la méthode toString
            de la classe. Ça nous permet donc d'aller vers la définition de la méthode.

        10. Sélectionner le champs foo, puis Ctrl + Shift + G. Que se passe-t-il ?
            Eclipse nous donne toutes les références du champs foo.

        11. À quoi sert Ctrl + Shift + O ?
            Il permet d'organiser les imports (ajouter les import nécéssaires, retirer ce qui ne le sont pas)

        12. À quoi sert Ctrl + Shift + C ?
            Il sert à commenter les lignes selectionner. Le refaire retire les "//" de commetaire.
        */





    }
}
