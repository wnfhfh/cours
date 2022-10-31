/*420-201 – Formatif 5
Groupe 2 – lundi & jeudi
Nom : Houde
Prénom : Antoine
DA : 2235325
*/

import java.util.Scanner;

public class Formatif5 {
    public Formatif5() {
        lireChoixValide("12345", "why are you gay8");
    }

    private void afficherFelicitations(int nbDeFelicitationsAAfficher) {

        for (int compteur = 0; compteur < nbDeFelicitationsAAfficher; compteur++) {
            System.out.println("Félicitation!");
        }
    }

    public String getLigneDeCaracteres(int nbCaracteresARetourner, char caractereARetourner) {
        String str = "";

        for (int compteur = 0; compteur < nbCaracteresARetourner; compteur++) {
            str += caractereARetourner;
        }
        return str;
    }

    public void testerGetLigneDeCaracteres() {
        String s;

        s = getLigneDeCaracteres(0, 'x');
        System.out.println(s.equals(""));

        s = getLigneDeCaracteres(1, '*');
        System.out.println(s.equals("*"));

        s = getLigneDeCaracteres(5, 'x');
        System.out.println(s.equals("xxxxx"));
    }

    public void afficherPyramide(int nbDEtoiles) {
        int incrementationEtoiles = 0;

        while (incrementationEtoiles <= nbDEtoiles) {
            System.out.println(getLigneDeCaracteres(incrementationEtoiles, '*'));
            incrementationEtoiles++;
        }
    }

    private void additionSuccessive(int nbLimite) {
        int chiffreAAjouter = 0;
        int totalAddition = 0;

        if (nbLimite < 0) {
            for (int compteur = 0; compteur >= nbLimite; compteur--) {
                totalAddition += chiffreAAjouter;
                chiffreAAjouter--;
            }
            System.out.println(totalAddition);
        } else {
            for (int compteur = 0; compteur <= nbLimite; compteur++) {
                totalAddition += chiffreAAjouter;
                chiffreAAjouter++;
            }
            System.out.println(totalAddition);
        }
    }

    private void testerAdditionSuccessive() {
        additionSuccessive(3);
        additionSuccessive(0);
        additionSuccessive(-3);
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

    private String lireEntierValide(String question, int valeurMin, int valeurMax) {
        String str = "";
        int valeurEntree = lireEntier(question);

        if (valeurEntree < valeurMin) {
            str = ("Erreur : " + valeurEntree + " est inférieur à " + valeurMin + ".");
        } else if (valeurEntree >= valeurMin && valeurEntree <= valeurMax) {
            str = (Integer.toString(valeurEntree));
        } else {
            str = ("Erreur : " + valeurEntree + " est supérieur à " + valeurMax + ".");
        }
        return str;
    }

    private void lireChoixValide(String choixValides, String question) {
        char lettreParLettre;
        String repUsager;
        char repUsagerChar;
        boolean repMemeQueUsager = false;
        boolean test = true;
        int charAt = 0;

        for (int compteur = 0; compteur < choixValides.length(); compteur++) {
            lettreParLettre = choixValides.charAt(compteur);
            repUsager = (lireString(question));
            repUsagerChar = repUsager.charAt(charAt);
            charAt++;

            if (repUsagerChar == lettreParLettre) {
                repMemeQueUsager = true;
                break;
            }
        }

        if (repMemeQueUsager == true) {
            System.out.println("good");
        } else {
            System.out.println("Erreur : Votre choix est invalide, choisissez parmi ces caractères: " + choixValides);
        }
    }

    public static void main(String[] args) {
        new Formatif5();
    }
}



