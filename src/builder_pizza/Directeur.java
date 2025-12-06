package builder_pizza;

public class Directeur {

    // Le chef prépare une Piquante
    public Pizza construirePizzaPiquante() {
        MonteurPizza monteur = new MonteurPizzaPiquante();
        return monteur.getPizza(); // Lance la construction
    }

    // Le chef prépare une Reine
    public Pizza construirePizzaReine() {
        MonteurPizza monteur = new MonteurPizzaReine();
        return monteur.getPizza(); // Lance la construction
    }
}