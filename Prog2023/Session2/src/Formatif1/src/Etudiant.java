package Formatif1.src;

public class Etudiant {
    private static String da;
    private static String nom;
    private static float note;

    public Etudiant(String info) {
        split();
    }

    private void split() {
    }

    public static void setDa(String da) {
        Etudiant.da = da;
    }

    public static void setNom(String nom) {
        Etudiant.nom = nom;
    }

    public static void setNote(float note) {
        Etudiant.note = note;
    }
}
