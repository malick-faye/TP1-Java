public class Arguments {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        // Mission 4.2 : conversion des chaînes en nombres
        int quantite = Integer.parseInt(args[2]);
        double prix = Double.parseDouble(args[1]);
        System.out.println("Prix x quantité = " + (prix * quantite));

        // Comparaison : sans conversion, + concatène les chaînes
        System.out.println("Sans conversion : " + (args[1] + args[2]));

    }

}
