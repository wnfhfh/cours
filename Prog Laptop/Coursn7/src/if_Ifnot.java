import java.text.DecimalFormat;

public class if_Ifnot {
    public if_Ifnot() {

        testerAfficherRabais();
    }

    private void testerAfficherRabais() {
        afficherRabais(0);
        afficherRabais(99.99);
        afficherRabais(-50);
        afficherRabais(100.001);
        afficherRabais(100);
        afficherRabais(1000);
        afficherRabais(2000);
        afficherRabais(1000.01);
    }

    private void afficherRabais(double montant) {
        String str;
        str = "pour un montant de " + montant;

        str += " vous avez un rabais de " + calculerMontantRabais(montant) + "$";  //tjrs séparer calculs de l'affichage

        System.out.println(str);
    }


    /**
     * Faire une méthode qui calcule (il fait juste le calculer et ne l’affiche pas)
     * un rabais en fonction d'un montant reçu en argument. (calculerRabais)
     * o -infini, 100[ -> 0
     * o [100, 500[ -> 2%
     * o [500, 1000[ -> 3%
     * o [1000, infini -> 5%
     */


    private double calculerMontantRabais(double montant) {
        double rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500) {
            rabais = (montant / 100) * 2;
        } else if (montant < 1000) {
            rabais = (montant / 100) * 3;
        } else if (montant < 2000) {
            rabais = (montant / 100) * 4;
        } else {
            rabais = (montant / 100) * 5;
        }

        System.out.format("%.2", rabais);

        return rabais;
    }

    public String to2Decimal(double value){
        String formatAvec2Decimales;
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        formatAvec2Decimales = df.format(value);
        return formatAvec2Decimales;
    }

    public static void main(String[] args) {
        new if_Ifnot();
    }
}
