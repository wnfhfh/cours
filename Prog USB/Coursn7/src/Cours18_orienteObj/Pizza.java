package Cours18_orienteObj;

public class Pizza {
    //attribut ou variable instance
    //n'existe pas sans instanciation
    //toujours attributs private
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    Pizza(int x, int y, String couleur, int vitesse) {
        setXY(x, y);
        setCouleur(couleur);
        setVitesse(vitesse);
    }

    public void setCouleur(String couleur) {

    }

    public void setVitesse(int vitesse) {

    }

    public void setXY(int pX, int y) {
        this.x = x;
        this.y = y; //this = l'instance de l'objet
    }

    public void avancerX() {
        x += vitesse;
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
