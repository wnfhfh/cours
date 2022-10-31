public class FormatifDebogueur {
    public FormatifDebogueur() {
        permutation();
    }
//commentaire
    public void permutation() {
        // Déclaration des variables
        int nb1 = 10;
        int nb2 = 15;
        int temp = 0;

        // Afficher les 2 nombres avant la permutation
        System.out.println("Avant la permutation: ");
        System.out.println("nb1 = " + nb1);
        System.out.println("nb2 = " + nb2);

        // Permuter les 2 nombres
        temp = nb1;
        nb1 = nb2;
        nb2 = temp;

        // Afficher les 2 nombres après la permutation
        System.out.println("Après la permutation: ");
        System.out.println("nb1 = " + nb1);
        System.out.println("nb2 = " + nb2);
    }

    public static void main(String[] args) {
        new FormatifDebogueur();
    }
}
