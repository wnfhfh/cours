package fichier;

import java.io.*;
import java.util.ArrayList;

public class FichierTexte {

    private static char fSep = File.separatorChar;
    private static String path = System.getProperty("user.dir") + fSep + "src" + fSep + "fichier" + fSep;
    private ArrayList<String> listeExpressions;

    public FichierTexte() {
        lireFichier("expressions.txt");
        System.out.println(listeExpressions);
        ecrireFichier("expressionsOut.txt");
    }

    private void lireFichier(String nomFichier) {
        String ligne;
        try {
            BufferedReader entree = new BufferedReader(new FileReader(nomFichier)); //ouverture fichier
            ligne = entree.readLine(); //lire une ligne
            while (ligne != null) {
                listeExpressions.add(ligne);
                System.out.println(ligne);
            }
            entree.close();
        } catch (IOException e) {
            System.out.println("problème de lecture de " + nomFichier);
        }
    }

    private void ecrireFichier(String nomFichier) {
        try {
            PrintWriter sortie = new PrintWriter(new FileWriter(path + nomFichier));
            for (int i = 0; i < listeExpressions.size(); i++) {
                sortie.println(listeExpressions.get(i));
            }
            sortie.flush(); //force l'écriture du buffer, a faire au besoin
            sortie.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new FichierTexte();
    }
}
