package pizza.maker.entity.topping;

public final class Ham implements Topping {
    private final String name;

    public Ham() {
        this.name = "Ham";
    }

    @Override
    public String getName() {
        return name;
    }
}
