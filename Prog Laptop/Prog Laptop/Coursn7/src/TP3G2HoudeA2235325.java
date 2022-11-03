import java.util.Random;

public class TP3G2HoudeA2235325 {
    public TP3G2HoudeA2235325() {
        testerCalculerGuerreDesNombres();
        testerCalculerGuerresDesNombres();
        testerEstEnOrdreCroissant();
        testerTronquer();
        testerCreerTableau2DAleatoire();
    }

    private int calculerGuerreDesNombres(int[] tabEffectifs) {
        int restant;
        int alliancePaire = 0;
        int axeImpaire = 0;

        if (tabEffectifs.length != 0) {
            for (int i = 0; i < tabEffectifs.length; i++) {
                if (tabEffectifs[i] % 2 == 0) {
                    alliancePaire += tabEffectifs[i];
                } else {
                    axeImpaire += tabEffectifs[i];
                }
            }
        }
        restant = alliancePaire - axeImpaire;

        return restant;
    }

    private void testerCalculerGuerreDesNombres() {
        System.out.println("calculerGuerreDesNombres");
        System.out.println(calculerGuerreDesNombres(new int[]{2, 8, 7, 5}) == -2);
        System.out.println(calculerGuerreDesNombres(new int[]{4, 8, 7, 5}) == 0);
        System.out.println(calculerGuerreDesNombres(new int[]{2, -8, 7, -5}) == -8);
        System.out.println(calculerGuerreDesNombres(new int[]{}) == 0);
        System.out.println(calculerGuerreDesNombres(new int[]{4, 1, 7}) == -4);
    }

    private int calculerGuerresDesNombres(int[][] tabEffectifs) {
        int restant = 0;

        for (int i = 0; i < tabEffectifs.length; i++) {
            restant += calculerGuerreDesNombres(tabEffectifs[i]);
        }

        return restant;
    }

    private void testerCalculerGuerresDesNombres() {
        System.out.println("calculerGuerresDesNombres");
        System.out.println(calculerGuerresDesNombres(new int[][]{{4, 8, 7, 5}, {2, -8, 7, -5}}) == -8);
        System.out.println(calculerGuerresDesNombres(new int[][]{{}, {2, 8, 7, -5}, {4, 1, 7}}) == 4);
    }

    private boolean estEnOrdreCroissant(int[] tabIn) {
        boolean enOrdreCroissant = true;
        if (tabIn.length > 1) {
            for (int i = 0; i < (tabIn.length - 1); i++) {
                if (tabIn[i] > tabIn[(i + 1)]) {
                    enOrdreCroissant = false;
                }
            }
        }
        return enOrdreCroissant;
    }

    private void testerEstEnOrdreCroissant() {
        System.out.println(estEnOrdreCroissant(new int[]{1, 1, 2, 3, 100}) == true);
        System.out.println(estEnOrdreCroissant(new int[]{1, -5, 2, 100, 3}) == false);
    }

    private int[] tronquerTableau(int[] tabIn, int longeurRep) {
        int[] tabRep = new int[longeurRep];

        if (tabIn.length > 0) {
            for (int i = 0; i < tabRep.length; i++) {
                tabRep[i] = tabIn[i];
            }
        }
        return tabRep;
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
            throw new IllegalArgumentException("max doit être plus grand que min");
        }
        Random r = new Random(); //Instaciation de la classe Random
        return r.nextInt((max - min) + 1) + min;
    }

    private int[][] calculerTab2DRandom(int lignes, int colonnes, int min, int max) {
        int[][] tab2DRandom = new int[lignes][colonnes];

        for (int i = 0; i < tab2DRandom.length; i++) {
            for (int j = 0; j < tab2DRandom[i].length; j++) {
                tab2DRandom[i][j] = getNombreAleatoireEntreBorne(min, max);
            }
        }
        return tab2DRandom;
    }

    private void testerCreerTableau2DAleatoire() {
        afficherTableau2D(calculerTab2DRandom(0, 0, 100, 120));
        afficherTableau2D(calculerTab2DRandom(2, 5, 100, 120));
    }


    private void afficherTableau2D(int[][] tab) {
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
        }
        System.out.println("]");
    }

    private void afficherTableau(int[] tabNb) {  //IMPORTANT A REUTILISER
        System.out.print("{");
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        new TP3G2HoudeA2235325();
    }
}