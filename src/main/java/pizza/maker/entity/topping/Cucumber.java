package pizza.maker.entity.topping;

public final class Cucumber implements Topping {
    private final String name;

    public Cucumber() {
        this.name = "Cucumber";
    }

    @Override
    public String getName() {
        return name;
    }
}
