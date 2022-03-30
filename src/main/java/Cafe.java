import product.Coffee;
import simpleFactory.CoffeeFactory;

public class Cafe {

    public Coffee makeCoffee(int num) {
        return CoffeeFactory.createCoffee(num);
    }

}
