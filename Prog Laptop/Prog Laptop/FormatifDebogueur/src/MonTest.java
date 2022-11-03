public class MonTest {
    public MonTest() {
        test2();
    }

    private void test2() {
        int a;
        a = 1;
        methode2(a);
        System.out.println(a);
    }

    private void methode2(int b) {
b=2;
    }

    private void traceManuelle() {
        int x;
        int y;
        int z;
        x = 0;
        y = 10;
        z = y;
        y = y + 1;
        z = z * y;
        x = x - 1;
        x = x * -2 + 3;
        x = 3 + x * 2;
    }

    public static void main(String[] args) {

        new MonTest();
    }
}

        /*afficherQuestion("Quel est votre prénom ? ");
        System.out.println(" ");
        afficherQuestion("Quelle est votre couleur favorite ? ");
        System.out.println(" ");
        System.out.println(lireEntier("Quel âge avez-vous ? "));
        System.out.println(" ");
        System.out.println("L'aire d'un rectangle de 2 par 3 est " + calculerAire(2, 3) + ".");
        System.out.println(" ");
        System.out.println("Le périmètre d'un rectangle de 4 par 5 est " + calculerPerimetre(4, 5) + ".");
        System.out.println(" ");
        afficherInfoRectangle("bleu",3,7);
         System.out.println(" "); */