package builder_pizza;

public class Client {
    public static void main(String[] args) {
        // 1. On embauche le Directeur (Le Chef)
        Directeur directeur = new Directeur();

        // 2. Commande d'une Pizza Reine
        System.out.println("... Commande Pizza Reine en cours ...");
        Pizza maReine = directeur.construirePizzaReine();
        maReine.print();

        // 3. Commande d'une Pizza Piquante
        System.out.println("\n... Commande Pizza Piquante en cours ...");
        Pizza maPiquante = directeur.construirePizzaPiquante();
        maPiquante.print();
    }
}