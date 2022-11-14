package tp4G2HoudeA2235325;

public class TableauDouble {
    public static final double VALEUR_DEFAUT = 0;
    public static final int LONGEUR_DEFAUT = 1;

    public TableauDouble(){
        double[] tabDouble = new double[LONGEUR_DEFAUT];
        set2Args();
    }
    double[] tabDouble = new double[LONGEUR_DEFAUT];


    public void set2Args(int longeur, double valeurAIniTab) {
        setAll(valeurAIniTab);
    }


    public double[] getTabDouble() {
        return tabDouble;
    }

    public void setAll(double valeur) {
        for (int i = 0; i < tabDouble.length; i++) {
            tabDouble[i] = VALEUR_DEFAUT;
        }
    }
}
