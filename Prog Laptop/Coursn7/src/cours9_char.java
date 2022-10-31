public class cours9_char {
    public cours9_char() {
        essayerChar();
        essayerCharAt();
        essayerModulo();
        compterDe1ANbLimite(5);
        testQqch();
    }

    private void testQqch() {

        int a = 1;
        char la = 'a';
        char lc = 'c';

        System.out.println(a - 2 >= 0);
        System.out.println(la > lc);
    }

    private void essayerChar() {
        char lettre;
        String mot = "aloh";

        //  lettre = "a"; on ne peut pas mettre une chaine de caracteres "" dans un char
        lettre = 'a';// constante char

        System.out.println("Canad");
        System.out.println(lettre);

        System.out.println((char)(lettre + 1));

        //aller voir table ASCII, chaque lettre est convertie par ordi en nb, puis reconverti pour etre
        //affichee. Ici, on va a la lettre apres "a" (qui est "b") et le (char) le reconverti en lettre

        mot += lettre;
        System.out.println(mot);
    }

    private void essayerCharAt() {
        String str = "sup les jeunes gens";
        char derniereLettre;
        int longeurChar;

        str = str.toUpperCase();
        System.out.println(str);
//        derniereLettre = str.charAt(6);
//        System.out.println(derniereLettre);

        longeurChar = str.length(); // calculer longeur str et la mettre dans longeurChar
        derniereLettre = str.charAt(longeurChar - 1); // -1 car on compte le 0
        System.out.println(derniereLettre);
    }

    private void essayerModulo() {
        int grosChiffre;
        int titChiffre;

        grosChiffre = 7;
        titChiffre = 4;

        System.out.println(grosChiffre + "/" + titChiffre + " = " + grosChiffre / titChiffre);
        System.out.println("reste = " + grosChiffre % titChiffre);
    }

    private void compterDe1ANbLimite(int nbLimite) {
        int compteur = 1;

        while (compteur <= (nbLimite)) {
            System.out.print(compteur);
            System.out.print(compteur < nbLimite ? "," : ".");  // ? est comme un if, : est comme "then"
            compteur++;
        }
    }


    public static void main(String[] args) {
        new cours9_char();
    }
}