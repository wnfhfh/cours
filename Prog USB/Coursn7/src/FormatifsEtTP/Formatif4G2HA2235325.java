package FormatifsEtTP;/*
Cours : 420-201 – Introduction à la programmation
Groupe : 2
Nom : Houde
Prénom : Antoine
DA : 2235325
*/

import java.util.Scanner;

public class Formatif4G2HA2235325 {
    public Formatif4G2HA2235325() {
        testerEstExact();
        testerPoserQuestionEtCorriger();
        testerEstEntreBornes();
        testerConvertirNoteACote();

        lireNote("Veuillez entrer une note qui sera convertie en cote de A à F: ");

    }

    private boolean estExact(String s1, String s2) {
        Boolean rep;
        rep = s1.equalsIgnoreCase(s2);
        return rep;
    }

    public void testerEstExact() {
        System.out.println(estExact("abc", "abc") == true);
        System.out.println(estExact("abc", "cbc") == false);
        System.out.println(estExact("abc", "Abc") == true);
    }

    private void poserQuestionEtCorriger(String question) {
        String repUsager;
        String bonneRep;
        boolean verifRep;

        repUsager = lireString(question);

        bonneRep = "Ottawa";
        verifRep = estExact(repUsager, bonneRep);

        if (verifRep == true) {
            System.out.println("Bonne réponse!");
        } else {
            System.out.println("Mauvaise réponse. La réponse est : " + bonneRep);
        }
    }

    private void testerPoserQuestionEtCorriger() {
        poserQuestionEtCorriger("Dans quelle ville jouent (au hockey) les Sénateurs?");
        poserQuestionEtCorriger("Quelle est la capitale du Canada?");
    }

    private boolean estEntreBornes(float nb, float valMin, float valMax) {
        boolean rep;

        if (valMin <= nb && nb <= valMax) {
            rep = true;
        } else {
            rep = false;
        }
        return rep;
    }


    public void testerEstEntreBornes() {
        System.out.println(estEntreBornes(74, 75, 80) == false); //affiche true
        System.out.println(estEntreBornes(75, 75, 80) == true);  //affiche true
        System.out.println(estEntreBornes(80, 75, 80) == true);  //affiche true
        System.out.println(estEntreBornes(81, 75, 80) == false); //affiche true
    }

    private char convertirNoteACote(float note) {
        char cote;

        if (note < 60) {
            cote = 'E';
        } else if (note < 70) {
            cote = 'D';
        } else if (note < 80) {
            cote = 'C';
        } else if (note < 90) {
            cote = 'B';
        } else {
            cote = 'A';
        }

        return cote;
    }


    public void testerConvertirNoteACote() {
        System.out.println(convertirNoteACote(-1) == 'E');
        System.out.println(convertirNoteACote(0) == 'E');
        System.out.println(convertirNoteACote(59) == 'E');
        System.out.println(convertirNoteACote(60) == 'D');
        System.out.println(convertirNoteACote(70) == 'C');
        System.out.println(convertirNoteACote(80) == 'B');
        System.out.println(convertirNoteACote(90) == 'A');
        System.out.println(convertirNoteACote(100) == 'A');
        System.out.println(convertirNoteACote(101) == 'A');
    }

    public void lireNote(String questionNote) {
        String note = lireString(questionNote);

        float floatNote = Float.parseFloat(note);
        if (estEntreBornes(floatNote, 0, 100) == true) {
            char cote = convertirNoteACote(floatNote);
            System.out.println("Vous avez entré la note: " + floatNote + ", ce qui vous donne la cote suivante: " + cote + ".");
        } else {
            System.out.println("Désolé: la note " + floatNote + " n'est pas valide. Veuillez entrer une valeur entre 0 et 100 inclusivement.");
        }
    }

    private String lireString(String question) {
        //lire au clavier
        String retourLectureTexte;

        System.out.println(question);

        Scanner scanner;  //instance de l'utilitaire de lecture

        scanner = new Scanner(System.in); //création de l'instance de l'utilitaire de lecture

        retourLectureTexte = scanner.nextLine();

        return retourLectureTexte;
    }


    public static void main(String[] args) {
        new Formatif4G2HA2235325();
    }
}