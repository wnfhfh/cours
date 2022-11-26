/*
420-201 – TP5
Groupe : 2 – lundi & jeudi
Nom : Houde
Prénom : Antoine Houde
DA : 2235325
*/
package PrjTP5G2HoudeA2235325;

import PrjTP5G2HoudeA2235325.Utile.Util;

import java.util.Locale;
import java.util.Objects;

public class Carte {
    public static final String[] COULEURS_VALIDES = new String[]{"pique", "trèfle", "carreau", "coeur"};
    public static final char[] COULEURS_CAR = new char[]{'\u2660', '\u2663', '\u2666', '\u2764'};
    private String couleur;
    private int valeur;

    public Carte(int valeurIn, String couleurIn) {
        setCouleur(couleurIn);
        setValeur(valeurIn);
    }

    public void setValeur(int valeurIn) {
        if (valeurEstValide(valeurIn)) {
            this.valeur = valeurIn;
        } else {
            throw new IllegalArgumentException("valeur " + valeurIn + " est invalide.");
        }
    }

    public static boolean valeurEstValide(int valeurIn) {
        boolean valeurValide = false;

        if (1 <= valeurIn && valeurIn <= 13) {
            valeurValide = true;
        }

        return valeurValide;
    }


    public void setCouleur(String couleurIn) {
        if (couleurEstValide(couleurIn)) {
            this.couleur = couleurIn;
        } else {
            throw new IllegalArgumentException("couleur " + couleurIn + " est invalide.");
        }
    }

    public static boolean couleurEstValide(String couleurIn) {
        boolean couleurEstValide = false;

        int strEstDansCouleursValides = Util.trouverStr(couleurIn, COULEURS_VALIDES);

        if (strEstDansCouleursValides >= 0) {
            couleurEstValide = true;
        }

        return couleurEstValide;
    }

    public int getValeur() {
        return valeur;
    }

    public String getCouleur() {
        couleur = couleur.toLowerCase();
        return couleur;
    }

    public char getCharCarte() {
        int positionCouleurDansTab = Util.trouverStr(couleur, COULEURS_VALIDES);

        return (COULEURS_CAR[positionCouleurDansTab]);
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur + " (" + getCharCarte() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return getValeur() == carte.getValeur() && getCouleur().equals(carte.getCouleur());
    }
}
