package dishes;

/**
 * Created by marcel on 15.02.17.
 */
public class Dish implements MenuItem {

    private String name;

    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String order() {
        return  "Your order: " + name + ", price: " + price;
    }
}
