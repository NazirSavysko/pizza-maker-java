package pizza.maker.entity.topping;

public final class Pepperoni implements Topping {
    private final String name;

    public Pepperoni() {
        this.name = "Pepperoni";
    }

    @Override
    public String getName() {
        return name;
    }
}
