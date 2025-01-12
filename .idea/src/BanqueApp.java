import java.util.Scanner; // Importation de la class scanner pour lire les entrées de l'utilisateur

public class BanqueApp{
    private String nomUtilisateur;
    private double solde;

    public BanqueApp(String nomUtilisateur, double soldeInitial){
        this.nomUtilisateur = nomUtilisateur;
        this.solde = soldeInitial;
    }

    public void deposerArgent(double montant) {
        if (montant > 0 ) {
            solde += montant;
            System.out.println("Dépot réussi ! Nouveau solde : "+ solde + "DH.");
        }else {
            System.out.println("Le montant doit etre positif pour effectuer un dépot.");
        }
    }
    public void retirerAgent(double montant) {
        if (montant > 0) {
            if (solde >= montant) {
                solde -= montant;
                System.out.println("Retrait réussi ! Nouveau solde : " + solde + "DH.");
            } else {
                System.out.println("Solde insuffisant pour effectuer ce retrait.");
            }
        }else{
            System.out.println("Le montant doit etre positif pour effectuer un retrait.");
        }
    }
    public void verfierSolde(){
        System.out.println(" Votre solde actuel est :" + solde + " DH.");
    }
}
