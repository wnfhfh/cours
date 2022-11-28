package src.PrjTP5G2HoudeA2235325;

import src.PrjTP5G2HoudeA2235325.Utile.TableauObjet;

public class Main21 {
    int nbCartesPigeesDepart;
    Paquet paquet;
    TableauObjet mainJoueur;
    TableauObjet mainBanquier;

    public Main21(Paquet p, int nbCartesDepart) {
        paquet = p;
        nbCartesPigeesDepart = nbCartesDepart;
    }

    public void pigerAu21() {
        for (int i = 0; i < nbCartesPigeesDepart; i++) {
            mainJoueur.add(paquet.piger());
        }
    }

    public int getNbCartesDsMain() {
        return mainJoueur.size();
    }

    public int getValeurCarteDe21(Carte c) {
        if (c.getValeur() == 1) {
            return 11;
        } else if (c.getValeur() <= 10) {
            return c.getValeur();
        } else if (c.getValeur() == 11) {
            return 10;
        } else if (c.getValeur() == 12) {
            return 10;
        } else if (c.getValeur() == 13) {
            return 10;
        }
        return c.getValeur();
    }

    public int getvaleurMainDe21() {
        int valeurMain = 0;
        for (int i = 0; i < getNbCartesDsMain(); i++) {
            valeurMain += (int) mainJoueur.get(i);
        }
        return valeurMain;
    }

    public boolean main21Gagnante() {
        boolean mainGagnante = false;
        if (getvaleurMainDe21() == 21) {
            mainGagnante = true;
        }
        return mainGagnante;
    }

    public boolean main21Perdante() {
        boolean mainPerdante = false;
        if (getvaleurMainDe21() > 21) {
            mainPerdante = true;
        }
        return mainPerdante;
    }

    public boolean main21GagnanteOuPerdante() {
        boolean mainGagnanteOuPerdante = false;
        if (main21Perdante() || main21Gagnante()) {
            mainGagnanteOuPerdante = true;
        }
        return mainGagnanteOuPerdante;
    }

    public int calcDiffDe21() {
        int diffDe21 = 0;

        if (getvaleurMainDe21() < 21) {
            return (21 - getvaleurMainDe21());
        } else if (getvaleurMainDe21()==21) {
            return getvaleurMainDe21();
        } else if (getvaleurMainDe21()>21) {
            return getValeurCarteDe21()
        }
    }

    @Override
    public String toString() {
        return "valeur du jeu 21 : " + getvaleurMainDe21() + " -> " +
    }
}