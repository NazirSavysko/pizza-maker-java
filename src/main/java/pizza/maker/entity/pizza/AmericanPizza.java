package pizza.maker.entity.pizza;

public final class AmericanPizza implements Pizza {
    private final String yeastDough;
    private final String cucumbers;
    private final String tomato;
    private final String bacon;

    public AmericanPizza(String yeastDough, String cucumbers, String tomato, String bacon) {
        this.yeastDough = yeastDough;
        this.cucumbers = cucumbers;
        this.tomato = tomato;
        this.bacon = bacon;
    }


    @Override
    public void bake() {
        System.out.println("Baking American pizza...");
        System.out.println("Dough: " + yeastDough);
        System.out.println("Toppings: " + cucumbers + ", " + tomato + ", " + bacon);
    }
}
