public class Cours17_tabeauxSuite {
    public Cours17_tabeauxSuite() {
        int[] tab1 = {1, 2, 3, 4};
        int[] tab2 = {5, 6, 7, 8};
        Cours16_tableaux.afficherTableau(fusionTableau(tab1, tab2));
        fusionTableau2(tab1, tab2);
    }

    public int[] fusionTableau(int[] tab1, int[] tab2) {
        int[] tabRep = new int[(tab1.length + tab2.length)]; //pour longeur de tabRep, on pourrait mettre une variable qui s'incrémente
        //a tt les fois dans boucles, serait mieux pour plusieurs tableau

        for (int i = 0; i < tab1.length; i++) {
            tabRep[i] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tabRep[(tab1.length + i)] = tab2[i];
        }

        return tabRep;
    }

    public int[] fusionTableau2(int[] tab1, int[] tab2) {
        int[][] tab2D = new int[2][2]; //tableau en 2D, premiere case ligne, 2ieme case colonne
        int[] tabUni = new int[(tab1.length + tab2.length)];

        tab2D[0] = tab1;
        tab2D[1] = tab2;

        afficherTab2D(tab2D);
        return tab1;
    }

    private void afficherTab2D(int[][] tab2D) {
        System.out.print("{");
        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D.length; j++) {
                System.out.print(tab2D[i][j] + ", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        new Cours17_tabeauxSuite();
    }
}
