import product.Coffee;
import product.Items;

public class Client {

    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        Coffee firstOrder = cafe.makeCoffee(Items.AMERICANO);
        Coffee secondOrder = cafe.makeCoffee(Items.LATTE);

        System.out.println(firstOrder);
        System.out.println(secondOrder);
    }

}
