/*
Cours : 420-201 – Introduction à la programmation
Groupe : 2
Nom : Houde
Prénom : Antoine
DA : 2235325
*/

public class Formatif6HoudeA {
    public Formatif6HoudeA() {
        testerGetNbValeursPositives();
        testerTrouverIndice();
        testerSontDesTableauxEgaux();
        testerRemplacerValeur();
        testerSortirLesNombresPositifs();
        testerFindLargestNbs();
    }

    private int getNbValeursPositives(int tA[]) {
        int nbPositifs = 0;

        for (int i = 0; i < tA.length; i++) {
            if (tA[i] >= 0) {
                nbPositifs++;
            }
        }
        return nbPositifs;
    }

    private void testerGetNbValeursPositives() {
        int t1[] = {1, -1, 0, 7};
        int tVide[] = {};

        System.out.println("testerGetNbValeursPositives");
        System.out.println(getNbValeursPositives(t1) == 3);
        System.out.println(getNbValeursPositives(tVide) == 0);
    }

    int trouverIndice(int[] tab, int indice) {
        int positionIndice = -1;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == indice) {
                positionIndice = i;
                break;
            }
        }
        return positionIndice;
    }

    private void testerTrouverIndice() {
        int t1[] = {1, -1, 1, 7};
        int tVide[] = {};

        System.out.println("testerTrouverIndice");
        System.out.println(trouverIndice(t1, -1) == 1);
        System.out.println(trouverIndice(t1, 1) == 0);
        System.out.println(trouverIndice(t1, 7) == 3);
        System.out.println(trouverIndice(t1, -2) == -1);
        System.out.println(trouverIndice(tVide, 7) == -1);
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

    private void testerSontDesTableauxEgaux() {
        int t1[] = {1, -1, 2, 7};
        int t2[] = {1, -1, 2, 7};
        int t3[] = {1, -1, 2, 8};
        int t4[] = {1, -1};
        int tVide[] = {};

        System.out.println("testerSontDesTableauxEgaux");
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);
        System.out.println(sontDesTableauxEgaux(t1, t3) == false);
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);
        System.out.println(sontDesTableauxEgaux(t1, t4) == false);
        System.out.println(sontDesTableauxEgaux(tVide, tVide) == true);
    }

    private void remplacerValeur(int[] tab, int ancienneValeur, int nouvelleValeur) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == ancienneValeur) {
                tab[i] = nouvelleValeur;
            }
        }
    }

    private void testerRemplacerValeur() {
        int t1[] = {1, -1, 2, 7, 2};
        int t2[] = {1, -1, 3, 7, 3};
        int t3[] = {1, -1, 3, 7, 3};
        int t4[] = {1, -1};
        int tVide[] = {};

        System.out.println("testerRemplacerValeur");
        System.out.println(sontDesTableauxEgaux(t1, t2) == false);
        remplacerValeur(t1, 2, 3);
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);

        System.out.println(sontDesTableauxEgaux(t2, t3) == true);
        remplacerValeur(t2, -99, 55);
        System.out.println(sontDesTableauxEgaux(t2, t3) == true);

        System.out.println(sontDesTableauxEgaux(tVide, tVide) == true);
    }

    private int[] sortirLesNombresPositifs(int[] tab) {
        int j = 0;
        int[] tab2 = new int[tab.length];
        int[] tabOut;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 0) {
                tab2[j] = tab[i];
                j++;
            }
        }
        tabOut = new int[j];

        for (int i = 0; i < j; i++) {
            tabOut[i] = tab2[i];
        }
        return tabOut;
    }

    private void testerSortirLesNombresPositifs() {
        int t1[] = {1, -1, 0, 7, -2};
        int t1Copie[] = {1, -1, 0, 7, -2};
        int t1Rep[] = {1, 0, 7};
        int t2[] = {1, 2, 7, 2};
        int tVide[] = {};
        int tRep[];

        System.out.println("testerSortirLesNombresPositifs");
        tRep = sortirLesNombresPositifs(t1);
        System.out.println(sontDesTableauxEgaux(tRep, t1Rep) == true);
        System.out.println(sontDesTableauxEgaux(t1, t1Copie) == true);

        tRep = sortirLesNombresPositifs(t2);
        System.out.println(sontDesTableauxEgaux(tRep, t2) == true);

        tRep = sortirLesNombresPositifs(tVide);
        System.out.println(sontDesTableauxEgaux(tRep, tVide) == true);
    }

    private void findLargestNbs(int[] tab0, int[] tab1, int[] tab2) {
        int[][] tabDeTab = new int[3][];
        int[] tabRep = new int[3];

        tabDeTab[0] = tab0;
        tabDeTab[1] = tab1;
        tabDeTab[2] = tab2;

        for (int j = 0; j < tabDeTab.length; j++) {
            int plusGrandNbDePetitTab = -999999999;
            if (tabDeTab[j].length == 0) {
                plusGrandNbDePetitTab = 0;
            }
            for (int i = 0; i < tabDeTab[j].length; i++) {
                if (tabDeTab[j][i] > plusGrandNbDePetitTab) {
                    plusGrandNbDePetitTab = tabDeTab[j][i];
                }
            }
            tabRep[j] = plusGrandNbDePetitTab;
        }
        afficherTableau(tabRep);
    }

    private void findLargestNbs2(int[][] tabDeTab) {
        int[] tabRep = new int[tabDeTab.length];

        for (int j = 0; j < tabDeTab.length; j++) {
            int plusGrandNbDePetitTab;
            if (tabDeTab[j].length!=0) {
                plusGrandNbDePetitTab = tabDeTab[j][1];
            }else{
                plusGrandNbDePetitTab = tabDeTab[j][1];
            }

            for (int i = 0; i < tabDeTab[j].length; i++) {
                if (tabDeTab[j][i] > plusGrandNbDePetitTab) {
                    plusGrandNbDePetitTab = tabDeTab[j][i];
                }
            }
            tabRep[j] = plusGrandNbDePetitTab;
        }
        afficherTableau(tabRep);
    }

    private void testerFindLargestNbs() {
        System.out.println("findLargestNbs");
        findLargestNbs(new int[]{4, 2, 7, 1}, new int[]{20, 70, 40, 90}, new int[]{1, 2, 0});
        findLargestNbs(new int[]{}, new int[]{20, 70, 40, 90}, new int[]{1, 2, 0});
        findLargestNbs(new int[]{-34, -54, -74}, new int[]{-32, -2, -65}, new int[]{-54, 7, -43});
    }

   // private void testerFindLargestNbs2() {
   //     System.out.println("findLargestNbs");
   //     findLargestNbs2(new int[][]{new int[]{4, 2, 7, 1}, new int[]{20, 70, 40, 90}, new int[]{1, 2, 0}});
   //     findLargestNbs2(new int[][]{new int[]{}, new int[]{20, 70, 40, 90}, new int[]{1, 2, 0}});
  //      findLargestNbs2(new int[][]{new int[]{-34, -54, -74}, new int[]{-32, -2, -65}, new int[]{-54, 7, -43}});
  //  }

    public static void afficherTableau(int[] tabNb) {  //IMPORTANT A REUTILISER
        System.out.print("{");
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        new Formatif6HoudeA();
    }
}