import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.println("Entrez votre solde initial : ");
        double soldeInitial = scanner.nextDouble();

        BanqueApp compte = new BanqueApp(nom, soldeInitial);

        int choix;
        do {
            System.out.println("\nMenu Principal :");
            System.out.println("1. Déposer de l'argent ");
            System.out.println("2. Retirer de l'argent");
            System.out.println("3. Vérifier le solde");
            System.out.println("4. Quitter l'application");
            System.out.println("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("\nCombien souhaitez-vous déposer ? ");
                    double depot = scanner.nextDouble();
                    compte.deposerArgent(depot);
                    break;
                case 2:
                    System.out.println("\nCombien souhaitez-vous retirer ? ");
                    double retrait = scanner.nextDouble();
                    compte.retirerAgent(retrait);
                    break;
                case 3:
                    compte.verfierSolde();
                    break;
                case 4:
                    System.out.println("Merci d'avoir utilisé notre application. A bientot !");
                    break;
                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");
            }
        } while (choix != 4);
        scanner.close();
    }
}