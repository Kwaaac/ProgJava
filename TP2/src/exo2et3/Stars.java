package exo2et3;

public class Stars {

    /**
     * Cette concaténation est odieuse puisqu'elle est manifestement de O(n²)
     * La raison est du au fait qu'à chaque concatenation (Strin.concat())
     * une nouvelle instance est créée et l'ancienne chaîne doit être copié avec
     * la nouvelle.
     */
    public static String printStarts(int n) {
        var res = "";

        for (int i = 0; i < n; i++) {
            res += "*";
        }

        return res;
    }

    public static String printStartsSB(int n) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            res.append("*");
        }

        return res.toString();
    }
}
