/*420-201 – Formatif 5
Groupe 2 – lundi & jeudi
Nom : Houde
Prénom : Antoine
DA : 2235325
*/

public class Formatif5 {
    public Formatif5() {
        afficherPyramide();
    }

    private void afficherFelicitations(int nbDeFelicitationsAAfficher) {

        for (int compteur = 0; compteur < nbDeFelicitationsAAfficher; compteur++) {
            System.out.println("Félicitation!");
        }
    }

    public String getLigneDeCaracteres(int nbCaracteresARetourner, char caractereARetourner) {
        String str = "";

        for (int compteur = 0; compteur < nbCaracteresARetourner; compteur++) {
            str += caractereARetourner;
        }
        return str;
    }

    public void testerGetLigneDeCaracteres() {
        String s;

        s = getLigneDeCaracteres(0, 'x');
        System.out.println(s.equals(""));

        s = getLigneDeCaracteres(1, '*');
        System.out.println(s.equals("*"));

        s = getLigneDeCaracteres(5, 'x');
        System.out.println(s.equals("xxxxx"));
    }

    public void afficherPyramide(int nbDEtoiles) {
        int incrementationEtoiles = 0;

        while (incrementationEtoiles < nbDEtoiles) {
            getLigneDeCaracteres(incrementationEtoiles, '*');
            incrementationEtoiles++;
        }

        public static void main (String[]args){
            new Formatif5();
        }
    }
