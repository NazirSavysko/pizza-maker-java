package pizza.maker.entity.topping;

public final class Tomato  implements Topping {
    private final String name;

    public Tomato() {
        this.name = "Tomato";
    }

    @Override
    public String getName() {
        return name;
    }
}
