public class Cours16_tableaux {
    public Cours16_tableaux() {
        jouerAvecTableau1();
    }

    private void jouerAvecTableau1() {

        double[] tabNb; //Déclaration d’un tableau

        tabNb = new double[3]; //Initialisation d’un tableau - instanciation quand on utilise new

        tabNb[0] = 1;
        tabNb[1] = 2;
        tabNb[2] = 3;

        // OU

        double tabNb2[] = {1.05, 2.4, 3.78};

        doublerValeurTab(tabNb2);

        System.out.println("longeur = " + tabNb2.length);

        moyValeursTab(tabNb2);
    }

    private void doublerValeurTab(double[] tabNb2) {
        System.out.print("{");
        for (int i = 0; i < tabNb2.length; i++) {
            System.out.print(i == 0 ? "" + (tabNb2[i] * 2) : ", " + (tabNb2[i] * 2));
        }
        System.out.println("}");
    }

    private void moyValeursTab(double[] tab) {
        double a = 0;

        for (int i = 0; i < tab.length; i++) {
            a += tab[i];
        }

        a = (a / tab.length);
        System.out.println("moy = " + a);
    }

    public static void afficherTableau(int[] tabNb) {  //IMPORTANT A REUTILISER
        System.out.print("{");
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        new Cours16_tableaux();
    }
}
