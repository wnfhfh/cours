import java.util.Scanner;

public class PP {
    public PP() {
        calculatrice();
    }

    private void calculatrice() {
        String terme1;
        String terme2;
        String Variable1;
        String egal = " ";
        String operation;
        float fTerme1;
        float fTerme2;

        terme1 = lireString();
        operation = lireString();
        terme2 = lireString();

        fTerme1 = stringEnFloat(terme1);
        fTerme2 = stringEnFloat(terme2);

        if (operation == "x") {
            egal += (toString(fTerme1 * fTerme2));
        }
        System.out.println(egal);
    }

    private float stringEnFloat(String strAConvertir) {
        float floatARetourner;

        floatARetourner = Float.parseFloat(strAConvertir);

        return floatARetourner;
    }

    private String lireString() {
        //lire au clavier
        String retourLectureTexte;

        Scanner scanner;  //instance de l'utilitaire de lecture

        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        retourLectureTexte = scanner.nextLine();

        return retourLectureTexte;
    }

    public static void main(String[] args) {
        new PP();
    }
}
