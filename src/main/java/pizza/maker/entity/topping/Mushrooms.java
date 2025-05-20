package pizza.maker.entity.topping;

public final class Mushrooms  implements Topping {
    private final String name;

    public Mushrooms() {
        this.name = "Mushrooms";
    }

    @Override
    public String getName() {
        return name;
    }
}
