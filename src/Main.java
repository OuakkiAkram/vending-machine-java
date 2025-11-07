import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> produits = new ArrayList<>(List.of("Eau", "Soda", "Chips", "Chocolat"));
        ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0));
        ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));

        while (true) {
            afficherMenu();
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    afficherProduits();
                    break;

                case "2":
                    acheterProduit();
                    afficherStock();
                    break;

                case "3":
                    System.out.println("Quitter");
                    break;

                default:
                    System.out.println(("Veuillez choisissez un nombre entre 1 et 3"));
            }

            if (choix.equals("3")) {
                break;
            }

        }
        scanner.close();
    }

    static void afficherMenu() {
        System.out.println("=== Distributeur Automatique ===");
        System.out.println("1. Afficher les produits ");
        System.out.println("2. Acheter un produit");
        System.out.println("3. Quitter");
        System.out.print("Entrez votre choix (1, 2, 3): ");
    }

    static void afficherProduits() {
        System.out.println("AfficherProduits");
    }

    static void acheterProduit() {
        System.out.println("acheterProduit");
    }

    static void afficherStock() {
        System.out.println("afficherStock");
    }

}