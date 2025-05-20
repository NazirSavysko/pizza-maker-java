package pizza.maker.entity.pizza;

import static java.lang.System.out;

public final class ItalianPizza implements Pizza {
    private final String yeastDough;
    private final String peperoni;
    private final String olives;
    private final String mushrooms;

    public ItalianPizza(String yeastDough, String peperoni, String olives, String mushrooms) {
        this.yeastDough = yeastDough;
        this.peperoni = peperoni;
        this.olives = olives;
        this.mushrooms = mushrooms;
    }

    @Override
    public void bake() {
        out.println("Baking Italian pizza...");
        out.println("Dough: " + yeastDough);
        out.println("Toppings: " + peperoni + ", " + olives + ", " + mushrooms);
    }
}
