package FormatifsEtTP;

public class TP3G2HoudeA2235325 {
    public TP3G2HoudeA2235325() {
        testerCalculerGuerreDesNombres();
        testerCalculerGuerresDesNombres();
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
            for (int i = 0; i < tabIn.length; i++) {
                if (tabIn[i] > tabIn[(i + 1)]) {
                    enOrdreCroissant = false;
                }
            }
        }
        return enOrdreCroissant;
    }

    public static void main(String[] args) {
        new TP3G2HoudeA2235325();
    }
}
