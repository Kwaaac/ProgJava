package fr.umlv.fight;

import java.util.Random;

/**
 * Exo2:
 * <p>
 * Question 1:
 * Un générateur pseudo aléatoire est un algorithme qui va nous donner une suite
 * qui est dite pseudo aléatoire. C'est à dire que même si la suite semble aléatoire
 * elle ne l'est puisqu'elle va à terme (pour de très longues données) se répéter.
 * Mais également car l'algorithme va déterminer la suite via une graine.
 * Il s'agit d'une entré donner au générateur qui va l'utiliser pour générer
 * la suite. Grâce à cela, nous pouvons avoir une suite que l'on peut considérer
 * aléatoire, mais réutilisable pour des tests par exemple.
 * </p>
 *
 * <p>
 * Question 3:
 * Il ne faut jamais qu'un soit déclarer avec une visibilité autre que private ou protected.
 * Pour respecter le principe d'encapsulation, on veut que les champs puisse accessible depuis leurs méthodes uniquement.
 * On ne veut pas pouvoir modifier les champs depuis d'autre classes sans passer par les
 * vérification des méthodes, voir on pourrait les initialiser à null sans le vouloir.
 *
 * </p>
 */
public class Fighter extends Robot {
    private final Random rdm;

    public Fighter(String name, long seed) {
        super(name);
        this.rdm = new Random(seed);
    }

    @Override
    boolean rollDice() {
        return rdm.nextBoolean();
    }

    @Override
    String displayType() {
        return "Fighter ";
    }
}
