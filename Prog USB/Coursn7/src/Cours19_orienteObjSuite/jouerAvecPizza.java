package Cours19_orienteObjSuite;

public class jouerAvecPizza {
    public jouerAvecPizza() {

        test2();
        testerConstante();

        Pizza p = new Pizza(3, 4, "rouge", 9);
    }

    private void test2() {

        Pizza[] tabPiz = new Pizza[5];

        for (int i = 0; i < tabPiz.length; i++) {
            tabPiz[i] = new Pizza(6, 8, "bleu", 3);
        }
    }

    private void testerConstante() {
        // acceder a const ou qqch de statique
        System.out.println(Pizza.LIMITE_SUPERIEURE);
        System.out.println(Pizza.LIMITE_INFERIEURE);
    }

    public static void main(String[] args) {
        new jouerAvecPizza();
    }
}
