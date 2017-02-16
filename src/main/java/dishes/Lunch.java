package dishes;

/**
 * Created by marcel on 15.02.17.
 */
public class Lunch implements MenuItem {

    private MainCourse mainCourse;

    private Dessert dessert;

    public Lunch(MainCourse mainCourse, Dessert dessert) {
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public String order() {
        double sum = dessert.getPrice() + mainCourse.getPrice();
        return "Main course: " + mainCourse + ", dessert: " + dessert + ", price: " + sum;
    }
}
