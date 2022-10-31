/*
Cours : 420-201 - Introduction à la programmation
Groupe : 1
Nom : Tétreault
Prénom : Xavier
DA : 2236756
*/

import java.util.Scanner;

public class Formatif3XT {
    public Formatif3XT() {
        //      afficherQuestion("Quelle est la longueur de votre rectangle ? ");
        testerAfficherInfoRectangle();
        demanderEtAfficherInfoRectangle();
    }

    private void demanderEtAfficherInfoRectangle() {
        int longueur;

        longueur = lireEntier("Quelle est la longueur de votre rectangle? ");

        int largeur;
        largeur = lireEntier("Quelle est la largeur de votre rectangle? ");
        String couleur;
        couleur = lireString("Quelle est la couleur de votre rectangle? ");
        afficherInfoRectangle(couleur,longueur ,largeur );
    }

    private void testerAfficherInfoRectangle() {
        afficherInfoRectangle("rouge", 3, 7);
        afficherInfoRectangle("bleu", 8, 9);
        afficherInfoRectangle("bleu", 30, 4);
        afficherInfoRectangle("vert", 4, 73);
        afficherInfoRectangle("jaune", 6, 5);
    }

    private void afficherInfoRectangle(String couleur, int longueur, int largeur) {
        System.out.println("Le rectangle a une longueur de " + longueur + " et une largeur de " + largeur + " .");
        System.out.println("Le rectangle est " + couleur + ".");
        System.out.println("Son périmètre est de " + calculerPerimetre(longueur, largeur) + ".");
        System.out.println("Son aire est de " + calculerAire(longueur, largeur) + ".");
    }


    private int lireEntier(String question) {
        int chiffre = Integer.parseInt(lireString(question));
        return chiffre;
    }

    private String lireString(String question) {
        afficherQuestion(question);
        Scanner sc;
        String reponse;
        sc = new Scanner(System.in);
        reponse = sc.nextLine();
        return reponse;
    }


    private void afficherQuestion(String q) {
        System.out.println(q);
    }

    private int calculerPerimetre(int largeur, int longueur) {
        int perimetre = 2 * (largeur + longueur);
        return perimetre;
    }

    private int calculerAire(int largeur, int hauteur) {
        int aire = largeur * hauteur;
        return aire;
    }

    public static void main(String[] args) {
        new Formatif3XT();
    }
}