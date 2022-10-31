/*Cours : 420-201 - Introduction à la programmation
Groupe : 2
Nom : Houde
Prénom : Antoine
DA : 2235325 */

import java.util.Scanner;

import static java.lang.Math.abs;

public class Formatif3AH {
    public Formatif3AH() {
        /*afficherQuestion("Quel est votre prénom ? ");
        System.out.println(" ");
        afficherQuestion("Quelle est votre couleur favorite ? ");
        System.out.println(" ");
        System.out.println(lireEntier("Quel âge avez-vous ? "));
        System.out.println(" ");
        System.out.println("L'aire d'un rectangle de 2 par 3 est " + calculerAire(2, 3) + ".");
        System.out.println(" ");
        System.out.println("Le périmètre d'un rectangle de 4 par 5 est " + calculerPerimetre(4, 5) + ".");
        System.out.println(" ");
        afficherInfoRectangle("bleu",3,7);
        System.out.println(" "); */
        testerAfficherInfoRectangle();
        demanderEtAfficherInfoRectangle();
    }


    private void afficherQuestion(String q) {
        System.out.println(lireString("Quel est votre prénom ? "));
    }

    private String lireString(String retourLectureTexte) {
        System.out.println(retourLectureTexte);
        //lire au clavier
        Scanner scanner;  //instance de l'utilitaire de lecture

        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        retourLectureTexte = scanner.nextLine();

        return retourLectureTexte;
    }

    private int lireEntier(String questionNb) {
        String nbString;
        int nbInt;

        System.out.println(questionNb);

        nbString = (lireString("Quel âge avez-vous?"));
        nbInt = Integer.parseInt(nbString);
        return nbInt;
    }


    private int calculerAire(int longeur, int largeur) {
        int aire;
        longeur = 2;
        largeur = 3;
        aire = longeur * largeur;
        return aire;
    }

    private int calculerPerimetre(int longeur, int largeur) {
        int perimetre;
        longeur = 4;
        largeur = 5;
        perimetre = 2 * (longeur + largeur);
        return perimetre;
    }

    private void afficherInfoRectangle(String couleurRectangle, int longeur, int largeur) {
        int perimetre;
        int aire;

        perimetre = 2 * (longeur + largeur);
        aire = longeur * largeur;

        System.out.println("Le rectangle a une longueur de " + longeur + " et une largeur de " + largeur + ".");
        System.out.println("Le rectangle est " + couleurRectangle + ".");
        System.out.println("Son périmètre est de " + perimetre + ".");
        System.out.println("Son aire est de " + aire + ".");
        System.out.println(" ");
    }

    private void testerAfficherInfoRectangle() {
        afficherInfoRectangle("rouge", 2, 9);
        afficherInfoRectangle("gris", -2, -9);
        afficherInfoRectangle("bleu poudre", 360000, 12);
        afficherInfoRectangle("mauve fluo", 45, -3);
        afficherInfoRectangle("vert", 5555, 2222);
    }

    private int lireEntierRectangle() {
        String nbString;
        int nbInt;

        Scanner scanner;  //instance de l'utilitaire de lecture

        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        nbString = scanner.nextLine();


        nbInt = Integer.parseInt(nbString);
        return nbInt;
    }

    private String lireStringRectangle() {
        //lire au clavier
        String retourLectureTexte;

        Scanner scanner;  //instance de l'utilitaire de lecture

        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        retourLectureTexte = scanner.nextLine();

        return retourLectureTexte;
    }


    private void demanderEtAfficherInfoRectangle() {
        int longeur;
        int largeur;
        String couleur;
        int perimetre;
        int aire;

        System.out.println("Quelle est la longeur de votre rectangle? ");
        longeur = lireEntierRectangle();

        if (longeur >= 0) {
            longeur = longeur * -1;
        }

        System.out.println("Quelle est la largeur de votre rectangle? ");
        largeur = lireEntierRectangle();

        if (largeur >= 0) {
            largeur = largeur * -1;
        }
        System.out.println("Quelle est la couleur de votre rectangle? ");
        couleur = lireStringRectangle();

        perimetre = 2 * (abs(longeur) + abs(largeur));
        aire = longeur * largeur;

        System.out.println("Le rectangle a une longueur de " + longeur + " et une largeur de " + largeur + ".");
        System.out.println("Le rectangle est " + couleur + ".");
        System.out.println("Son périmètre est de " + perimetre + ".");
        System.out.println("Son aire est de " + aire + ".");
    }


    public static void main(String[] args) {

        new Formatif3AH();
    }
}
