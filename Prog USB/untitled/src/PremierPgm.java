import java.sql.SQLOutput;

public class PremierPgm { //La classe doit avoir exactement le même nom que le fichier
    //Appuyer sur ALT-Insert pour créer le constructeur
    public PremierPgm() { //Constructeur - a exactement le même nom que la classe et que le fichier
        System.out.println("Je suis dans contructeur");

        afficherBonjourLeMonde();

        System.out.println("Bonjour le monde 1"); //affiche une chaine de caractères et change de ligne
        System.out.println("Bonjour le monde 2"); //affiche une chaine de caractères et change de ligne
    }

    private void afficherBonjourLeMonde() { //instructions pour que la variable puisse être appelée plus haut
        System.out.println("Bonjour le monde")
        System.out.println((2 * 2)/ 2 );
    }


    public static void main(String[] args) {
        System.out.println("Je suis dans le main");
        new PremierPgm(); //Appeler le constructeur de la classe PremierPgm
    }
}

