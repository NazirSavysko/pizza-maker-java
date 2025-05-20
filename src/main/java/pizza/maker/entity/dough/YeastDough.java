package pizza.maker.entity.dough;

public final class YeastDough implements Dough {
    private final String name;

    public YeastDough() {
        this.name = "Yeast Dough";
    }

    @Override
    public String getName() {
        return name;
    }
}
