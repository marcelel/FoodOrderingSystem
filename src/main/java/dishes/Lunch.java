package dishes;

/**
 * Created by marcel on 15.02.17.
 */
public class Lunch {

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
}
