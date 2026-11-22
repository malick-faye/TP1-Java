public class GestionFacture {

    public static void main(String[] args) {
        // 1 à 3 : récupération des arguments
        String produit = args[0];
        String prixTexte = args[1];
        String quantiteTexte = args[2];

        // 4 : conversion en nombres
        double prixUnitaire = Double.parseDouble(prixTexte);
        int quantite = Integer.parseInt(quantiteTexte);

        // 5 : calcul du montant total
        double total = prixUnitaire * quantite;

        // 6 : affichage
        System.out.println("===== FACTURE =====");
        System.out.println("Produit       : " + produit);
        System.out.println("Prix unitaire : " + prixUnitaire);
        System.out.println("Quantité      : " + quantite);
        System.out.println("Montant total : " + total);
        System.out.println("===================");
    }

}
