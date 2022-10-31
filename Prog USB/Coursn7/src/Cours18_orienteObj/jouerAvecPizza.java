package Cours18_orienteObj;

public class jouerAvecPizza {
    public jouerAvecPizza() {
        test1();
        test2();

        Pizza p = new Pizza(3, 4, "rouge", 9);
        System.out.println(p);
    }

    private void test2(); {
        Pizza [] tabPiz = new Pizza[5];

        for (int i = 0; i < tabPiz.length; i++) {
            tabPiz[i] = new Pizza()
        }
    }

    public static void main(String[] args) {
        new jouerAvecPizza();
    }
}
