package product;

public class Latte extends Coffee {

    private int milk;

    public Latte() {
        putEspresso();
        putMilk();
    }

    @Override
    public void putEspresso() {
        espresso = 2;
    }

    public void putMilk() {
        milk = 2;
    }

    @Override
    public String toString() {
        return "Latte{" +
                "espresso=" + espresso +
                ", milk=" + milk +
                '}';
    }

}
