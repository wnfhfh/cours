package Formatif1.src;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class ListeEtudiantTest {
    public ListeEtudiantTest() {
        ListeEtudiants listeEtudiants = new ListeEtudiants();

        listeEtudiants.lireEtudiants();  //lit un fichier
//        listeEtudiants.trier(); //trie les éléments de la structure par nom ascendant
//        System.out.println(listeEtudiants); //affiche les données de la structure
//        listeEtudiants.ajouterANote(10); //ajoute la note passée en argument aux étudiants de la structure
//        listeEtudiants.ecrireEtudiants(); //écrit le fichier
    }

    public static void main(String[] args) {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out),true, StandardCharsets.UTF_8));
        new ListeEtudiantTest();
    }
}

