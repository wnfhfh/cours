package PrjTP5G2HoudeA2235325;

import PrjTP5G2HoudeA2235325.Utile.TableauObjet;
import PrjTP5G2HoudeA2235325.Utile.Util;

public class Paquet {
    TableauObjet paquet = new TableauObjet(0);
    private int compteurPige = 0;

    public Paquet(boolean estMelange) {
        if (estMelange == false) {
            setPaquet();
        } else {
            melanger();
        }
    }

    public void melanger() {
        setPaquet();

        int randomIndexValeur;
        Object randomValeur;

        for (int i = 0; i < 52; i++) {
            randomIndexValeur = Util.getNombreAleatoireEntreBorne(1, 51);

            randomValeur = paquet.get(randomIndexValeur);

            paquet.set(randomIndexValeur, paquet.get(i));
            paquet.set(i, randomValeur);
        }
    }

    public void setPaquet() {
        int compteur = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 13; j++) {
                paquet.add(new Carte(j, Carte.COULEURS_VALIDES[i]));
                compteur++;
            }
        }
//        for (int j = 0; j < 52; j++) {
//            System.out.println(paquet[j].toString());
//        }
    }

    public Object piger() {

        if (compteurPige == 0) {
            melanger();
        }
        if (compteurPige <= 52) {
            return paquet.remove(compteurPige);
        }
        return null;
    }

    public int getNombreDeCartes() {
        return paquet.size();
    }

    public boolean estVide() {
        boolean paquetVide = false;
        if (paquet.size() == 0) {
            paquetVide = true;
        }
        return paquetVide;
    }

    @Override
    public String toString() {
        return paquet.toString();
    }

    public static void main(String[] args) {
        new Paquet(false);
    }
}
