package Utile;

public class SplitTexte {
    public SplitTexte() {
        String [] mots;
        String phrase = "Autant chercher une aiguille dans une botte de foin.";

        mots = phrase.split("e");
        for (int i = 0; i < mots.length; i++) {
            System.out.println(mots[i]);
        }
    }

    public static void main(String[] args) {
        new SplitTexte();
    }
}
