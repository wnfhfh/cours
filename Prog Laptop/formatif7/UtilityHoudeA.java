package src.formatif7;

import java.util.Scanner;

public class UtilityHoudeA {
    public UtilityHoudeA() {
    }

    public static void afficherTableau(int[] tabNb) {
        System.out.print("{");
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.println("}");
    }

    public String à2Décimales(double valeur) {
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
}
