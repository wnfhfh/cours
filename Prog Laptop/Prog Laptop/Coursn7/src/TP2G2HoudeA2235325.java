/*420-201 – Formatif 5
Groupe 2 – lundi & jeudi
Nom : Houde
Prénom : Antoine
DA : 2235325
*/

import java.util.Scanner;

public class TP2G2HoudeA2235325 {
    public TP2G2HoudeA2235325() {
        testerCalculerRabaisEscalier();
        afficherCalculerMoyenne();
        testerEstProche();
        testerAfficherDroite();
    }

    public float calculerRabaisEscalier(float prix, int nbDArticles) {
        String strPrix;
        String strRabais;
        float rabais = 0;

        if (nbDArticles >= 3) {
            rabais = (prix / 100) * 3;
            if (nbDArticles >= 6) {
                rabais = (prix / 100) * 10;
                if (nbDArticles >= 12) {
                    rabais = (prix / 100) * 15;
                }
            }
        }

        strRabais = a2Decimales(rabais);
        strPrix = a2Decimales(prix);

        return rabais;
    }

    private void testerCalculerRabaisEscalier() {
        boolean test;

        System.out.println(calculerRabaisEscalier(100, 1) == 0);
        System.out.println(calculerRabaisEscalier(100, 2) == 0);
        System.out.println(calculerRabaisEscalier(100, 3) == 3);
        System.out.println(calculerRabaisEscalier(100, 5) == 3);
        System.out.println(calculerRabaisEscalier(100, 6) == 10);
        System.out.println(calculerRabaisEscalier(100, 11) == 10);
        System.out.println(calculerRabaisEscalier(100, 12) == 15);
        System.out.println(calculerRabaisEscalier(100, 13) == 15);
        System.out.println(calculerRabaisEscalier(1000, 13) == 150);
    }

    private void afficherCalculerMoyenne() {
        int incrNombre = 1;
        int nbAAjouterAMoy = 0;
        float totalPourMoy = 0;
        float moy = 0;

        System.out.println("** Calculer la moyenne de nombres positifs. **");
        System.out.println("Entrez un nombre negatif pour arreter");

        while (nbAAjouterAMoy >= 0) {
            nbAAjouterAMoy = Integer.parseInt(lireString("Enter le nombre #" + incrNombre + ": "));
            if (nbAAjouterAMoy >= 0) {
                totalPourMoy += nbAAjouterAMoy;
            }
            incrNombre++;
        }
        moy = totalPourMoy / (incrNombre - 2);

        if (moy > 0) {
            System.out.println("La moyenne des " + (incrNombre - 2) + " nombres est : " + moy);
        } else {
            System.out.println("Il faut entrer au moins un nombre pour calculer une moyenne.");
        }
    }

    private void estProche(double x1, double x2, double y1, double y2, double distanceMax) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distanceMax >= distance);
    }

    private void testerEstProche() {
        estProche(1, 2, 0, 0, 2);
        estProche(1, 1, 3, 12, 10);
        estProche(3, 1, 2.984, 12, 9.3);
        estProche(-2, 1, 3, -6.7, 10.16);
    }

    public String afficherDroite(double pente, int ordonneOrigine, int dimQuadrant) {
        String str = "";
        double x = 0;
        int nbDespaces;

        System.out.println("Pente = " + pente + "; Ordonnée à l'origine = " + ordonneOrigine + "; Dim quadrant = " + dimQuadrant);

        for (int y = dimQuadrant; y >= 1; y--) {   // axe des y
            x = (int) ((y - ordonneOrigine) / pente);
            boolean xPareilQueXPrecedents = xPareilQueXPrecedents((int) x, y, pente, ordonneOrigine, dimQuadrant);

            if (x != 0) {
                str += "+";
            } else if (xPareilQueXPrecedents != true) {
                str += "*";
            }

            for (nbDespaces = 0; nbDespaces < (x - 1); nbDespaces++) {  // espaces avant *
                str += " ";
            }
            if (nbDespaces <= (dimQuadrant - 2) && !xPareilQueXPrecedents && x > 0) {
                str += ("*");
            }
            str += "\n";
        }

        x = (int) ((0 - ordonneOrigine) / pente);

        for (int compteur = 0; compteur <= (x - 1); compteur++) {    // axe des x
            str += "+";
        }

        str += "*";

        for (int compteur = 0; compteur < dimQuadrant; compteur++) {
            str += "+";
        }
        return str;
    }

    private boolean xPareilQueXPrecedents(int x, int y, double pente, int ordonneOrigine, int dimQuadrant) {
        boolean xPareilQueXPrecedents = false;

        for (int i = 1; i <= dimQuadrant; i++) {
            if (x == (int) ((y - i - ordonneOrigine) / pente)) {
                xPareilQueXPrecedents = true;
                break;
            }
        }
        return xPareilQueXPrecedents;
    }

    private void testerAfficherDroite() {
        System.out.println(afficherDroite(1, 0, 6));
        System.out.println(afficherDroite(.5, 0, 10));
        System.out.println(afficherDroite(-2, 10, 10));
        System.out.println(afficherDroite(-1, 6, 10));
    }

    public String a2Decimales(float valeur) {

        String strFormatAvec2Decimales;
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        strFormatAvec2Decimales = df.format(valeur);
        return strFormatAvec2Decimales;
    }

    private String lireString(String question) {
        String str;

        System.out.println(question);
        Scanner scanner;  //instance de l'utilitaire de lecture
        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        str = scanner.nextLine();

        return str;
    }

    private int lireEntier(String question) {
        String nbString;
        int nbInt;

        System.out.println(question);
        Scanner scanner;  //instance de l'utilitaire de lecture
        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        nbString = scanner.nextLine();

        nbInt = Integer.parseInt(nbString);

        return nbInt;
    }

    public static void main(String[] args) {
        new TP2G2HoudeA2235325();
    }
}
