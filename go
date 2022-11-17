package tp4G2HoudeA2235325;

import java.util.Arrays;

public class TableauDouble {
    public static final double VALEUR_DEFAUT = 0;
    public static final int LONGUEUR_DEFAUT = 5;
    double[] tabDouble;

    public TableauDouble(int longeur, double valeur) {
        tabDouble = new double[longeur];
        setAll(valeur);
    }

    public TableauDouble(int longeur) {
        this(longeur, VALEUR_DEFAUT);
    }

    public TableauDouble() {
        this(LONGUEUR_DEFAUT);
    }


    public double[] getTabDouble() {
        return tabDouble;
    }

    @Override
    public String toString() {
        return "longueur: " + tabDouble.length + " " + Arrays.toString(tabDouble);
    }

    public void setAll(double valeur) {
        for (int i = 0; i < tabDouble.length; i++) {
            tabDouble[i] = valeur;
        }
    }
}
