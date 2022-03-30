package simpleFactory;

import product.Americano;
import product.Coffee;
import product.Items;
import product.Latte;

public class CoffeeFactory {

    public static Coffee createCoffee(int num) {
        switch (num) {
            case Items.AMERICANO:
                return new Americano();
            case Items.LATTE:
                return new Latte();
            default:
                throw new IllegalArgumentException("메뉴에 존재하지 않는 커피입니다.");
        }
    }

}
