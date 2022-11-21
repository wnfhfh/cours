/*
420-201 – TP5
Groupe : 2 – lundi & jeudi
Nom : Houde
Prénom : Antoine Houde
DA : 2235325
*/
package src.PrjTP5G2HoudeA2235325.Utile;

import java.util.Random;
import java.util.Scanner;

public class Util {

    public static void afficherTableauInt(int[] tabNb) {
        System.out.print("{");
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.println("}");
    }

    public static void afficherTableauString(String[] tabString) {
        System.out.print("{");
        for (int i = 0; i < tabString.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabString[i]);
        }
        System.out.println("}");
    }


    private String lireString(String question) {
        String str;

        System.out.println(question);
        Scanner scanner;  //instance de l'utilitaire de lecture
        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        str = scanner.nextLine();

        return str;
    }

    private int lireInt(String question) {
        String nbString;
        int nbInt;

        System.out.println(question);
        Scanner scanner;  //instance de l'utilitaire de lecture
        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        nbString = scanner.nextLine();

        nbInt = Integer.parseInt(nbString);

        return nbInt;
    }

    public int getNombreAleatoireEntreBorne(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max doit être plus grand que min");
        }
        Random r = new Random(); //Instaciation de la classe Random
        return r.nextInt((max - min) + 1) + min;
    }

    public static int trouverStr(String strATrouver, String[] tab) {
        int position = -1;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i].equalsIgnoreCase(strATrouver)) {
                position = i;
                break;
            }
        }
        return position;
    }
}
