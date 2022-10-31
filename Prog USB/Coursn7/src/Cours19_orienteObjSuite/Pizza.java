package Cours19_orienteObjSuite;

public class Pizza {
    //constante : variable qui ne peut pas etre changee apres instanciation. Son nom doit etre en maj
    //static : appartient a la classe --> durée de vie infinie
    //final : la variabl est initialisee et ne pourra jamais etre changee
    public static final int LIMITE_SUPERIEURE = 100;
    public static final int LIMITE_INFERIEURE = 0;

    //attribut ou variable instance
    //n'existe pas sans instanciation
    //toujours attributs private
    private static int x;
    private static int y;
    private static int vitesse;
    private String couleur;

    Pizza(int x, int y, String couleur, int vitesse) {
        setXY(x, y);
        setCouleur(couleur);
        setVitesse(vitesse);
    }

    public void setCouleur(String couleur) {

    }

    public void setVitesse(int vitesse) {
        if (estValideVitesse(vitesse)) {
            this.vitesse = vitesse;
        } else {
            throw new RuntimeException("vitesse est invalide : Vitesse = " + vitesse);
        }
    }

    public void setXY(int pX, int y) {
        if (estValideVitesse(vitesse)) {
            this.x = x;
            this.y = y; //this = l'instance de l'objet
        } else {
            throw new RuntimeException("X ou Y est invalide : x = " + x + ", y=" + y);
        }
    }

    public static boolean estValideXY(int x, int y) {
        boolean estV;
        estV = LIMITE_INFERIEURE <= x && x <= LIMITE_SUPERIEURE && LIMITE_INFERIEURE <= y && y <= LIMITE_SUPERIEURE;
        return estV;
    }

    public static boolean estValideVitesse(int vitesse) {
        boolean estV;
        estV = LIMITE_INFERIEURE <= x && x <= LIMITE_SUPERIEURE;
        return estV;
    }

    public void avancerX() {
        x += vitesse;
    }

    public static void testerValidation() {
        Pizza p = new Pizza(25, -1, "vert", 150);
        estValideVitesse(vitesse);
        estValideXY(x, y);
        System.out.println(p);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + x +
                ", y=" + y +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
