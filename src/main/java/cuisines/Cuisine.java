package cuisines;

import dishes.Dessert;
import dishes.MainCourse;

import java.util.ArrayList;

/**
 * Created by marcel on 15.02.17.
 */
public class Cuisine {

    private String name;

    private ArrayList<MainCourse> mainCourses;

    private ArrayList<Dessert> desserts;

    public Cuisine(String name) {
        this.name = name;
        mainCourses = new ArrayList<MainCourse>();
        desserts = new ArrayList<Dessert>();
    }

    public void addMainCourse(String name, double price) {
        mainCourses.add(new MainCourse(name, price));
    }

    public void addDesserts(String name, double price) {
        desserts.add(new Dessert(name, price));
    }

    public Dessert findDessert(String name) {
        for (Dessert d : desserts) {
            if (d.getName().equals(name)) {
                return d;
            }
        }
        return null;
    }

    public MainCourse findMainCourse(String name) {
        for (MainCourse m : mainCourses) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<MainCourse> getMainCourses() {
        return mainCourses;
    }

    public ArrayList<Dessert> getDesserts() {
        return desserts;
    }

    public String getName() {
        return name;
    }
}
