package pizza.maker.entity.pizza;

import static java.lang.System.out;

public final class AsianPizza implements Pizza {
    private final String shortcrustDough;
    private final String ham;
    private final String cucumbers;
    private final String olives;
    private final String mushrooms;

    public AsianPizza(String shortcrustDough, String ham, String cucumbers, String olives, String mushrooms) {
        this.shortcrustDough = shortcrustDough;
        this.ham = ham;
        this.cucumbers = cucumbers;
        this.olives = olives;
        this.mushrooms = mushrooms;
    }

    @Override
    public void bake() {
        out.println("Baking Asian pizza...");
        out.println("Dough: " + shortcrustDough);
        out.println("Toppings: " + ham + ", " + cucumbers + ", " + olives + ", " + mushrooms);
    }
}
