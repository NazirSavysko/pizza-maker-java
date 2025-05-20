package pizza.maker.entity.topping;

public final class Bacon implements Topping {
    private final String name;

    public Bacon() {
        this.name = "Bacon";
    }

    @Override
    public String getName() {
        return name;
    }
}
