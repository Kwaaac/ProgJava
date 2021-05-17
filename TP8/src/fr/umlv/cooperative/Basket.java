package fr.umlv.cooperative;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final Map<Fruit, Integer> basket = new HashMap<>();

    public void add(Fruit fruit, Integer count) {
        basket.put(fruit, basket.getOrDefault(fruit, 0) + count);
    }

    public void add(Fruit fruit) {
        add(fruit, 1);
    }

    @Override
    public String toString() {
        var str = new StringBuilder();
        var price = 0;
        for (var entry : basket.entrySet()) {
            var fruit = entry.getKey();
            var count = entry.getValue();
            str.append(fruit).append("x ").append(count).append("\n");
            price += fruit.price() * count;
        }

        return str.toString() + "price: " + price;
    }
}
