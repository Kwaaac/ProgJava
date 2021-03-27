package exo4;

import java.util.regex.Pattern;

/**
 * Je ne l'ai pas terminer en entier, c'était pour m'amuser durant le TP !
 */
public class Main_exo4 {

    /**
     * Factorised method to catch a pattern in an array of String
     *
     * @param pattern Pattern to look for in the strings
     * @param array   Array of String
     */
    private static void printRegexMatches(String pattern, String[] array) {
        var p = Pattern.compile(pattern);

        for (String str : array) {
            var matcher = p.matcher(str);
            if (matcher.matches()) {
                System.out.println(matcher.group());
            }
        }
    }

    private static void printDigitMatch(String[] array) {
        printRegexMatches("\\d*", array);
    }

    /**
     * @param array
     * @warning ne fonctionne pas exactement comme l'énoncé :triste:
     */
    private static void printStartWithoutDigitMatch(String[] array) {
        printRegexMatches("\\d*|\\D*\\d", array);
    }

    public static void main(String[] args) {
        // La classe Pattern est une version compiler d'une chaîne de caractère en un patterne d'expression régulière
        // Le Pattern permet alors d'être utiliser pour créer un object Matcher qui va match le pattern sur une chaîne
        // de caractère.
        // La méthode compile va servir de compiler une chaîne de caractère en un Pattern.

        printDigitMatch(args);
        printStartWithoutDigitMatch(args);

    }
}
