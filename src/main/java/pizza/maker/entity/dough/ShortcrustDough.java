package pizza.maker.entity.dough;

public final class ShortcrustDough implements Dough {
    private final String name;

    public ShortcrustDough() {
        this.name = "Shortcrust Pastry";
    }

    @Override
    public String getName() {
        return name;
    }
}
