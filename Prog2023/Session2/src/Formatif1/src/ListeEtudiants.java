package Formatif1.src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListeEtudiants {
    private static String path = System.getProperty("user.dir") + "\\Session2\\src\\Formatif1\\src\\";

    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    public static void lireEtudiants() {
        String ligne = "";
        System.out.printf(path);
        try {
            BufferedReader entree = new BufferedReader(new FileReader(path + "etudiantsIn.csv")); //ouverture fichier
            while (ligne != null) {
                ligne = entree.readLine();
                System.out.println(ligne);
            }
            entree.close();
        } catch (IOException e) {
            System.out.println("problème de lecture de etudiantsIn.csv");
        }
    }

    public void trier() {
    }

    public void ajouterANote(int i) {
    }

    public void ecrireEtudiants() {
    }
}
