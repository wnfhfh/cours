/*
Cours : 420-201 – Introduction à la programmation
Groupe : 2
Nom : Houde
Prénom : Antoine
DA : 2235325
*/
package src.PrjTP5G2HoudeA2235325.Utile;

import java.util.Arrays;

public class TableauObjet {
    public static final Object VALEUR_DEFAUT = 0;
    public static final int LONGUEUR_DEFAUT = 5;
    Object[] tabObject;
    private int longeur;

    public TableauObjet(int longeur, Object valeur) {
        tabObject = new Object[longeur];
        setAll(valeur);
    }

    public TableauObjet(int longeur) {
        this(longeur, VALEUR_DEFAUT);
    }

    public TableauObjet() {
        this(LONGUEUR_DEFAUT);
    }


    public Object[] getTabObject() {
        return tabObject;
    }

    @Override
    public String toString() {
        return "longueur: " + tabObject.length + " " + Arrays.toString(tabObject);
    }

    public void setAll(Object valeur) {
        for (int i = 0; i < tabObject.length; i++) {
            tabObject[i] = valeur;
        }
    }

    public int size() {
        int size = tabObject.length;
        return size;
    }

    public void set(int emplacement, Object valeur) {
        tabObject[emplacement] = valeur;
    }

    public Object get(int emplacement) {
        Object valeur = tabObject[emplacement];
        return valeur;
    }

    public void add(Object valeur) {
        Object[] tabObjectAgrandi = new Object[tabObject.length + 1];

        for (int i = 0; i < tabObject.length; i++) {
            tabObjectAgrandi[i] = tabObject[i];
        }
        tabObjectAgrandi[tabObjectAgrandi.length - 1] = valeur;
        tabObject = tabObjectAgrandi;
    }

    public void clear() {
        for (int i = 0; i < tabObject.length; i++) {
            tabObject[i] = VALEUR_DEFAUT;
        }
    }

    public void remove(int emplacement) {
        Object[] tabObjectRaccourci = new Object[tabObject.length - 1];
        for (int i = 0; i < emplacement; i++) {
            tabObjectRaccourci[i] = tabObject[i];
        }
        for (int i = emplacement; i < tabObjectRaccourci.length; i++) {
            tabObjectRaccourci[i] = tabObject[i + 1];
        }
        tabObject = tabObjectRaccourci;
    }

    public void set(Object[] nouveauTabObject) {
        Object[] temp = new Object[nouveauTabObject.length];

        for (int i = 0; i < nouveauTabObject.length; i++) {
            temp[i]=nouveauTabObject[i];
        }
        tabObject = temp;
        setLongeur(temp.length);
    }

    public void setLongeur(int longeur){
        this.longeur = longeur;
    }
}
