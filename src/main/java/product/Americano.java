package product;

public class Americano extends Coffee {

    int water;

    public Americano() {
        putEspresso();
        putWater();
    }

    @Override
    public void putEspresso() {
        espresso = 2;
    }

    public void putWater() {
        water = 2;
    }

    @Override
    public String toString() {
        return "Americano{" +
                "water=" + water +
                ", espresso=" + espresso +
                '}';
    }

}
