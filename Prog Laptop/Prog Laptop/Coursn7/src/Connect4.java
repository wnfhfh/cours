import java.sql.SQLOutput;
import java.util.Scanner;

public class Connect4 {
    public Connect4() {
        appelDesJoueurs();
    }

    private void appelDesJoueurs() {
        int entreeJoueur1;
        int entreeJoueur2;
        int alternanceJoueurs = 0;
        boolean finDePartie = false;
        char[][] tableauDeJeu = creerTableauJeu();
        afficherTableau(tableauDeJeu);
        do {
            if (alternanceJoueurs % 2 == 0) {
                entreeJoueur1 = lireEntier("Joueur 1, entrez votre colonne") - 1;
                tableauDeJeu = calculerTableauJoueur1(entreeJoueur1, tableauDeJeu);
                afficherTableau(tableauDeJeu);

            }
            if (alternanceJoueurs % 2 != 0) {

                entreeJoueur2 = lireEntier("Joueur 2, entrez votre colonne") - 1;
                tableauDeJeu = calculerTableauJoueur2(entreeJoueur2, tableauDeJeu);
                afficherTableau(tableauDeJeu);

            }
            alternanceJoueurs++;
        } while (finDePartie == false);
    }

    private char[][] creerTableauJeu() {
        char[][] tabDeJeu = new char[6][7];
        for (int i = 0; i < tabDeJeu.length; i++) {
            for (int j = 0; j < tabDeJeu[i].length; j++) {
                tabDeJeu[i][j] = '.';
            }
        }
        return tabDeJeu;
    }

    private void afficherTableau(char[][] tab) {

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab[i].length; j++) {


                System.out.print(tab[i][j]);

                if (j == tab[i].length - 1) {
                    System.out.print("");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    private int lireEntier(String question) {
        //lire au clavier
        int retourLectureTexte;

        System.out.println(question);

        Scanner scanner;  //instance de l'utilitaire de lecture

        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        retourLectureTexte = Integer.parseInt(scanner.nextLine());

        return retourLectureTexte;
    }

    private char[][] calculerTableauJoueur1(int entreeJoueur1, char[][] tableauDeJeu) {
        for (int i = tableauDeJeu.length - 1; i >= 0; i--) {
            if (tableauDeJeu[i][entreeJoueur1] == '.') {
                if (estColonnePleine(entreeJoueur1) == false) {
                    tableauDeJeu[i][entreeJoueur1] = 'X';
                    break;
                } else {
                    calculerTableauJoueur1(entreeJoueur1, tableauDeJeu);
                }
            }
        }
        return tableauDeJeu;
    }

    private char[][] calculerTableauJoueur2(int entreeJoueur2, char[][] tableauDeJeu) {
        for (int i = tableauDeJeu.length - 1; i >= 0; i--) {
            if (tableauDeJeu[i][entreeJoueur2] == '.' && estColonnePleine(entreeJoueur2) == false) {
                if (estColonnePleine(entreeJoueur2) == false) {
                    tableauDeJeu[i][entreeJoueur2] = 'O';
                    break;
                } else {
                    calculerTableauJoueur2(entreeJoueur2, tableauDeJeu);
                }
            }
        }
        return tableauDeJeu;
    }

    private boolean estColonnePleine(int entreeJoueur) {
        int[] colonnesEnRemplissage = new int[7];
        boolean estColonnePleine = false;

        if (colonnesEnRemplissage[entreeJoueur] >= 6) {
            System.out.println("Cette colonne est pleine. Veuillez en choisir une autre.");
            estColonnePleine = true;
        }
        colonnesEnRemplissage[entreeJoueur]++;
        return estColonnePleine;
    }

    public static void main(String[] args) {
        new Connect4();
    }
}