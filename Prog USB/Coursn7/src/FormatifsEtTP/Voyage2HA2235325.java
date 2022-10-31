package FormatifsEtTP;/*
Cours : 420-201 – Introduction à la programmation
Groupe : 2
Nom : Houde
Prénom : Antoine
DA : 2235325
*/

import java.util.Scanner;

public class Voyage2HA2235325 {
    public Voyage2HA2235325() {
        testerAfficherInfoVoyage();
        recevoirEtAfficherInfoVoyage(0, 0, 0, 0);
    }

    private double donnéeLitresEssence(double litresEssence) {
        return litresEssence;
    }

    private double donnéeDistanceKm(double distanceKm) {
        return distanceKm;
    }

    private double donnéePrixEssence(double prixEssence) {
        return prixEssence;
    }

    private double donnéeTempsHeure(double tempsHeure) {
        return tempsHeure;
    }


    private double consommationAu100Km(double litresEssence, double distanceKm) {
        litresEssence = donnéeLitresEssence(30);
        distanceKm = donnéeDistanceKm(200);
        double consommation;

        consommation = (100 * litresEssence) / distanceKm;
        return consommation;
    }

    private double vitesseMoy(double tempsHeure, double distanceKm) {
        tempsHeure = donnéeTempsHeure(5);
        distanceKm = donnéeDistanceKm(200);
        double vitesseMoy;

        vitesseMoy = distanceKm / tempsHeure;
        return vitesseMoy;
    }

    private double prixVoyage(double litresEssence, double prixEssence) {
        litresEssence = donnéeLitresEssence(30);
        prixEssence = donnéePrixEssence(2.6);
        double prixVoyage;

        prixVoyage = litresEssence * prixEssence;
        return prixVoyage;
    }

    private void afficherInfoVoyage(double distanceKm, double tempsHeure, double prixEssence, double litresEssence) {

        System.out.println("******************************************************************");
        System.out.println("Vous avez parcouru " + distanceKm + " km en " + tempsHeure + " heures.");
        System.out.println("Le prix de l'essence est de $" + prixEssence + ".");
        System.out.println("Vous avez utilisé " + litresEssence + " litres d'essence.");
        System.out.println("La vitesse moyenne de la voiture est de : " + vitesseMoy(tempsHeure, distanceKm) + " km/heure.");
        System.out.println("Cette voiture a une consommation moyenne de : " + consommationAu100Km(litresEssence, distanceKm) + " litres/100 km.");
        System.out.println("Le voyage a coûté $" + prixVoyage(litresEssence, prixEssence) + ".");
        System.out.println("******************************************************************");
    }

    private void testerAfficherInfoVoyage() {
        afficherInfoVoyage(12, 100, 6, 2.25);
        afficherInfoVoyage(11.23, 21.4, 3.22, -4);
        afficherInfoVoyage(5.0001, -3, 3.5, 2);
    }

    private double lireDouble() {
        String str;
        str = lireClavier();

        double strEnDouble = Double.parseDouble(str);

        return strEnDouble;
    }


    private String lireClavier() {
        //lire au clavier
        String retourLectureTexte;

        Scanner scanner;  //instance de l'utilitaire de lecture

        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        retourLectureTexte = scanner.nextLine();

        return retourLectureTexte;
    }

    private void recevoirEtAfficherInfoVoyage(double distanceKm, double tempsHeure, double prixEssence, double litresEssence) {
        double vitesseMoy = vitesseMoy(tempsHeure, distanceKm);
        double consommationAu100Km = consommationAu100Km(litresEssence, distanceKm);
        double prixVoyage = prixVoyage(litresEssence, prixEssence);

        String strDistanceKm;   //ce bloc de variables est utilisé pour faire la conversion d'un double vers un string,
        String strTempsHeure;  // pour pouvoir les arrondir à 2 décimales.
        String strPrixVoyage;
        String strPrixEssence;
        String strLitresEssence;
        String strVitesseMoy;
        String strConsommationAu100Km;

        System.out.print("Quelle distance avez-vous parcourue? ");
        distanceKm = lireDouble();
        strDistanceKm = à2Décimales(distanceKm);

        System.out.print("En combien de temps (en heure)? ");
        tempsHeure = lireDouble();
        strTempsHeure = à2Décimales(tempsHeure);

        System.out.print("Quel est le prix de l'essence? ");
        prixEssence = lireDouble();
        strPrixEssence = à2Décimales(prixEssence);

        System.out.print("Combien de litres d'essence avez-vous utilisés? ");
        litresEssence = lireDouble();
        strLitresEssence = à2Décimales(litresEssence);

        strVitesseMoy = à2Décimales(vitesseMoy);
        strConsommationAu100Km = à2Décimales(consommationAu100Km);
        strPrixVoyage = à2Décimales(prixVoyage);

        System.out.println("******************************************************************");
        System.out.println("Vous avez parcouru " + strDistanceKm + " km en " + strTempsHeure + " heures.");
        System.out.println("Le prix de l'essence est de $" + strPrixEssence + ".");
        System.out.println("Vous avez utilisé " + strLitresEssence + " litres d'essence.");
        System.out.println("La vitesse moyenne de la voiture est de : " + strVitesseMoy + " km/heure.");
        System.out.println("Cette voiture a une consommation moyenne de : " + strConsommationAu100Km + " litres/100 km.");
        System.out.println("Le voyage a coûté $" + strPrixVoyage + ".");
        System.out.println("******************************************************************");
    }

    public String à2Décimales(double valeur) {

        String strFormatAvec2Decimales;
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        strFormatAvec2Decimales = df.format(valeur);
        return strFormatAvec2Decimales;
    }


    public static void main(String[] args) {
        new Voyage2HA2235325();
    }
}
