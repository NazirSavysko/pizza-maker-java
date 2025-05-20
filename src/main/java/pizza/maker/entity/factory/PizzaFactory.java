package pizza.maker.entity.factory;

import pizza.maker.entity.pizza.Pizza;
import pizza.maker.entity.dough.ShortcrustDough;
import pizza.maker.entity.dough.YeastDough;
import pizza.maker.entity.pizza.AmericanPizza;
import pizza.maker.entity.pizza.AsianPizza;
import pizza.maker.entity.pizza.ItalianPizza;
import pizza.maker.entity.topping.*;

public final class PizzaFactory {
    private PizzaFactory() {
    }

    public static Pizza createPizza(final String type) {
        switch (type) {
            case "American pizza":
                return new AmericanPizza(
                        new YeastDough().getName(),
                        new Cucumber().getName(),
                        new Tomato().getName(),
                        new Bacon().getName()
                );
            case "Asian pizza":
                return new AsianPizza(
                        new ShortcrustDough().getName(),
                        new Ham().getName(),
                        new Pepperoni().getName(),
                        new Olives().getName(),
                        new Mushrooms().getName()
                );
            case "Italian pizza":
                return new ItalianPizza(
                        new YeastDough().getName(),
                        new Pepperoni().getName(),
                        new Olives().getName(),
                        new Mushrooms().getName()
                );
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
