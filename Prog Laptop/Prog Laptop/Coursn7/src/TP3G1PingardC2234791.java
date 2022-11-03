/* 420-201 – TP3
Groupe : 2 – lundi & jeudi
Nom : Aubé-Poitras
Prénom : Pierre-Alexandre
DA : 1234567
 */

import java.util.Random;

public class TP3G1PingardC2234791 {
    public TP3G1PingardC2234791() {
//testerGuerreDesNombres();
// testerEstEnOrdreCroissant();
// testerTronquer();
        afficherTableau(creerTableau2DRandom(4,6,-20,100));
        System.out.println("");
        afficherTableau(creerTableau2DRandom(7,2,0,9));
    }

    private int calculerGuerreDesNombres(int[] tab) {
        int nbPair = 0;
        int nbImpair = 0;
        for (int i = 0; i < tab.length; i++) {
            if ((tab[i] % 2) == 0) {
                nbPair += tab[i];
            } else nbImpair += tab[i];

        }

        return nbPair - nbImpair;
    }

    private void testerGuerreDesNombres() {
        System.out.println(calculerGuerreDesNombres(new int[]{2, 8, 7, 5}));
// 2 + 8 = 10
// 7 + 5 = 12
// Retour : 10 - 12 = -2
        System.out.println(calculerGuerreDesNombres(new int[]{4, 8, 7, 5}));
//        calculerGuerreDesNombres ([4, 8, 7, 5]) ➞ 0
        System.out.println(calculerGuerreDesNombres(new int[]{2, -8, 7, -5}));
//        calculerGuerreDesNombres ([2, -8, 7, -5]) ➞ -8
        System.out.println(calculerGuerreDesNombres(new int[]{}));
//        calculerGuerreDesNombres ([]) ➞ 0
        System.out.println(calculerGuerreDesNombres(new int[]{4, 1, 7}));
//        calculerGuerreDesNombres ([4, 1, 7]) ➞ -4
//        calculerGuerresDesNombres ([4, 8, 7, 5], [2, -8, 7, -5]) ➞ -8
//        calculerGuerresDesNombres ([], [2, 8, 7, -5]}, [4, 1, 7]) ➞ 4
        System.out.println(calculerGuerresDesNombres(new int[][]{{4, 8, 7, 5}, {2, -8, 7, -5}}));
        System.out.println(calculerGuerresDesNombres(new int[][]{{2, 8, 7, -5}, {4, 1, 7}}));
    }

    private int calculerGuerresDesNombres(int[][] tab) {
        int nbPair = 0;
        int nbImpair = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if ((tab[i][j] % 2) == 0) {
                    nbPair += tab[i][j];
                } else nbImpair += tab[i][j];

            }
        }

        return nbPair - nbImpair;
    }

    private boolean estEnOrdreCroissant(int[] tab) {
        boolean estTrue = true;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < tab[i - 1]) {
                estTrue = false;
            }

        }

        return estTrue;
    }

    private void testerEstEnOrdreCroissant() {
        System.out.println(estEnOrdreCroissant(new int[]{4, 8, 7, 5}) == false);
        System.out.println(estEnOrdreCroissant(new int[]{1, 1, 2, 3, 100}) == true);
        System.out.println(estEnOrdreCroissant(new int[]{}) == true);

    }

    private int[] tronquerTableau(int[] tab, int premiersNombres) {
        int[] tabTronque = new int[premiersNombres];
        for (int i = 0; i < premiersNombres; i++) {
            tabTronque[i] = tab[i];

        }
        return tabTronque;
    }

    private void testerTronquer() {
        int[] tVide = {};
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {1, 2, 3};
        int[] tRep;

        System.out.println("testerTronquer()");
        tRep = tronquerTableau(tVide, 0);
        System.out.println(sontDesTableauxEgaux(tRep, tVide));
        tRep = tronquerTableau(tab1, 5);
        System.out.println(sontDesTableauxEgaux(tRep, tab1));
        tRep = tronquerTableau(tab1, 3);
        System.out.println(sontDesTableauxEgaux(tRep, tab2));
        tRep = tronquerTableau(tab1, 0);
        System.out.println(sontDesTableauxEgaux(tRep, tVide));
    }

    private boolean sontDesTableauxEgaux(int[] tab1, int[] tab2) {
        boolean sontEgaux = true;

        for (int i = 0; i < tab1.length && i < tab2.length; i++) {
            if (tab1[i] != tab2[i]) {
                sontEgaux = false;
                break;
            }
        }
        if (tab1.length != tab2.length) {
            sontEgaux = false;
        }
        return sontEgaux;
    }

    public int getNombreAleatoireEntreBorne(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException(" max doit etre plus grand que le min");
        }
        Random r = new Random();
        return r.nextInt(min-1,max+1);
    }

    public int[][] creerTableau2DRandom(int lignes, int colonnes, int min, int max) {
        int[][] tabAleatoire = new int[lignes][colonnes];
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                tabAleatoire[i][j] = getNombreAleatoireEntreBorne(min, max);
            }
        }
        return tabAleatoire;
    }

    private void afficherTableau(int[][] tab) {
        System.out.println("Tableau 2D");
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab[i].length; j++) {
                if (j == 0) {
                    if (i != 0) {
                        System.out.print(" ");
                    }
                    System.out.print("[");
                }
                System.out.print(tab[i][j]);

                if (j == tab[i].length - 1) {
                    System.out.print("]");

                } else {
                    System.out.print(", ");
                }
            }
            if (i != tab.length-1)
                System.out.print(",");
        }
        System.out.print("]");


    }

    public static void main(String[] args) {
        new TP3G1PingardC2234791();
    }
}
