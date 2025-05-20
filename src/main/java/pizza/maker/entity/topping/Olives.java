package pizza.maker.entity.topping;

public final class Olives implements Topping {
    private final String name;

    public Olives() {
        this.name = "Olives";
    }

    @Override
    public String getName() {
        return name;
    }
}
