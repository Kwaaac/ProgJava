package fr.umlv.cooperative.main;

import fr.umlv.cooperative.Apple;
import fr.umlv.cooperative.AppleKind;
import fr.umlv.cooperative.Basket;
import fr.umlv.cooperative.Pear;

public class Main {
    public static void main(String[] args) {
        /*
        var apple1 = new Apple(20, "Golden");
        var apple2 = new Apple(40, "Pink Lady");

        var basket = new Basket();
        basket.add(apple1);
        basket.add(apple2);
        System.out.println(basket);

        var set = new HashSet<Apple>();
        set.add(new Apple(20, "Golden"));
        System.out.println(set.contains(new Apple(20, "Golden")));
         */

        var apple1 = new Apple(20, AppleKind.GOLDEN);
        var apple2 = new Apple(40, AppleKind.PINKLADY);
        var apple3 = new Apple(30, AppleKind.GRANNYSMITH);
        var pear = new Pear(5);

        var basket = new Basket();

        basket.add(apple1, 5);      // 5 pommes
        basket.add(apple2, 12);
        basket.add(apple3);
        basket.add(pear, 7);        // 7 poires
        System.out.println(basket);


    }
}

