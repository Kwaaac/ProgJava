package fr.esipe.info.math;

import java.util.Arrays;


public class Matrice {

    private final int n; /* nombre de lignes */
    private final int m; /* nombre de colonnes */
    private final Rational[][] coeff; /* liste des coefficients */

    /**
     * Création d'une matrice
     *
     * @param coeff coefficients de la matrice
     */
    public Matrice(Rational[][] coeff) {
        n = coeff.length;
        m = coeff[0].length;
        this.coeff = coeff;
    }

    /**
     * Création d'une matrice
     *
     * @param coeff coefficients de la matrice, donnés comme long
     */
    public Matrice(long[][] coeff) {
        n = coeff.length;
        m = coeff[0].length;
        this.coeff = new Rational[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.coeff[i][j] = new Rational(coeff[i][j]);
            }
        }
    }

    /**
     * Calcul de la somme matricielle this + M (si les dimensions de this et M
     * l'autorisent)
     *
     * @param M matrice à ajouter : tableau n x m
     * @return somme this + M : tableau n x m
     */
    public Matrice plus(Matrice M) {
        if (n != M.n || m != M.m) {
            throw new IllegalArgumentException("Dimensions incorrectes");
        }
        Rational[][] sum = new Rational[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = M.coeff[i][j].plus(this.coeff[i][j]);
            }
        }

        return new Matrice(sum);
    }

    /**
     * Calcul du produit matriciel this M (si les dimensions de this et M
     * l'autorisent)
     *
     * @param M matrice à multiplier : tableau m x p
     * @return produit this M : tableau n x p
     */
    public Matrice times(Matrice M) {
        if (m != M.n) {
            throw new IllegalArgumentException("Dimensions incorrectes");
        }
        int p = M.m;

        Rational[][] prod = new Rational[n][p];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                prod[i][j] = Rational.ZERO;
                for (int k = 0; k < m; k++) {
                    prod[i][j] = prod[i][j].plus(coeff[i][k].times(M.coeff[k][j]));
                }
            }
        }

        return new Matrice(prod);
    }

    /**
     * Calcul de la transposée de this
     *
     * @return transposée de this : tableau m x n
     */
    public Matrice transpose() {
        Rational[][] trans = new Rational[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[j][i] = coeff[i][j];
            }
        }

        return new Matrice(trans);
    }

    /**
     * Échange les lignes i et j de la matrice
     *
     * @param i première ligne à échanger
     * @param j deuxième ligne à échanger
     */
    public void swapRows(int i, int j) {
        Rational[] tmp = coeff[i];
        coeff[i] = coeff[j];
        coeff[j] = tmp;
    }

    /**
     * Ajoute a fois la ligne i de this à sa ligne j
     *
     * @param i ligne à ajouter (multiplée par a)
     * @param j ligne à laquelle on ajoute a fois la ligne j
     * @param a scalaire par lequel on multiplie la ligne i quand on l'ajoute
     */
    public void transvection(int i, int j, Rational a) {
        for (int k = 0; k < m; k++) {
            coeff[j][k] = coeff[j][k].plus(coeff[i][k].times(a));
        }
    }


    /**
     * Mutiplie par a la ligne i de this
     *
     * @param i ligne à multiplier par a
     * @param a scalaire par lequel on multiplie la ligne i
     */
    private void multiplyRow(int i, Rational a) {
        for (int k = 0; k < coeff[i].length; k++) {
            coeff[i][k] = coeff[i][k].times(a);
        }
    }

    private void divideRow(int i, Rational a) {
        if (a.equals(Rational.ZERO)) {
            throw new IllegalArgumentException("On ne peux pas diviser par 0");
        }

        for (int k = 0; k < coeff[i].length; k++) {
            coeff[i][k] = coeff[i][k].divide(a);
        }
    }

    /**
     * Calcul de la matrice identité de mêmes dimensions que this (si les dimensions
     * de this l'autorisent)
     *
     * @return matrice identité : tableau n x n
     */
    public Matrice identity() {
        if (m != n) {
            throw new IllegalArgumentException("Dimensions incorrectes");
        }
        Rational[][] id = new Rational[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    id[i][j] = Rational.ONE;
                } else {
                    id[i][j] = Rational.ZERO;
                }
            }
        }

        return new Matrice(id);
    }

    /**
     * Calcul d'une copie de this
     *
     * @return copie de this : tableau n x m
     */
    public Matrice clone() {
        Rational[][] clone = new Rational[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                clone[i][j] = coeff[i][j];
            }
        }
        return new Matrice(clone);
    }

    public int maxInColumn(int col) {
        var max = coeff[col][col];
        var index = col;

        for (var i = col + 1; i < n; i++) {
            if (coeff[i][col].isGreaterThan(max)) {
                max = coeff[i][col];
                index = i;
            }
        }

        return index;
    }

    /**
     * soustrait a fois la ligne i de this à sa ligne j
     *
     * @param i ligne à soustraire (multiplée par a)
     * @param j ligne à laquelle on ajoute a fois la ligne j
     * @param a scalaire par lequel on multiplie la ligne i quand on l'ajoute
     */
    public void transvection_minus(int i, int j, Rational a) {
        for (int k = 0; k < coeff[i].length; k++) {
            coeff[i][k] = coeff[i][k].minus(coeff[j][k].times(a));
        }
    }

    /**
     * Calcul de l'inverse de this
     *
     * @return inverse de this : tableau n x n
     */
    public Matrice inverse() {
        if (m != n) {
            throw new IllegalArgumentException("Dimensions incorrectes");
        }
        var clone = clone();
        var id = identity();
        /** Remplir ici le code manquant */
        /** On suggère très fortement d'utiliser l'algorithme du pivot de Gauss */
        /**
         *  S'il s'avère que la matrice this n'a pas d'inverse :
         *    throw new ArithmeticException("Division par zéro");
         */

        Rational a;
        for (int j = 0, r = 0; j < m; j++, r++) {

            if (!clone.coeff[r][j].equals(Rational.ZERO)) {

                a = clone.coeff[r][j];
                clone.divideRow(r, a);
                id.divideRow(r, a);

                for (int i = 0; i < n; i++) {
                    if (i != r) {
                        a = clone.coeff[i][j];
                        clone.transvection_minus(i, r, a);
                        id.transvection_minus(i, r, a);
                    }
                }

            } else {
                throw new ArithmeticException("Division par zéro, la matrice n'a pas d'inverse");
            }
        }

        return id;
    }

    /**
     * Résoud une équation linéaire matricielle
     * <p>
     * this est une matrice m x n
     *
     * @param b vecteur m x 1 que l'on veut obtenir
     * @return vecteur colonne a tel que this * a = b : tableau n x 1
     */
    public Matrice resoud(Matrice b) {
        if (m != b.n) {
            throw new IllegalArgumentException("Dimensions incorrectes");
        }

        Matrice inverse;
        try {
            inverse = inverse();
        } catch (Exception e) {
            throw new ArithmeticException("Pas de solution");
        }

        return inverse.times(b);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(Arrays.toString(coeff[i])).append("\n");
        }

        return sb.toString();
    }


}
