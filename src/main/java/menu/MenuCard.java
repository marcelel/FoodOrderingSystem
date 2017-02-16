package menu;

import cuisines.Cuisine;
import dishes.Dessert;
import dishes.Drink;
import dishes.MainCourse;

import java.util.ArrayList;

/**
 * Created by marcel on 15.02.17.
 */
public class MenuCard {

    private ArrayList<Cuisine> cuisines;

    private ArrayList<Drink> drinks;

    private void addInitialCuisines() {
        cuisines.add(new Cuisine("Polish"));
        cuisines.add(new Cuisine("Mexican"));
        cuisines.add(new Cuisine("Italian"));
        for (int i = 0; i < cuisines.size(); i++) {
            for (int j = 0; j < 3; j++) {
                cuisines.get(i).addMainCourse(cuisines.get(i).getName() + "MainCourse" + j, 20 + 5*j);
                cuisines.get(i).addDesserts(cuisines.get(i).getName() + "Dessert" + j, 10 + 5*j);
            }
        }
    }

    private void addInitialDrinks() {
        for (int i = 0; i < 3; i++) {
            drinks.add(new Drink("Drink" + i, 5 + 5*i));
        }
    }

    public MenuCard() {
        cuisines = new ArrayList<Cuisine>();
        drinks = new ArrayList<Drink>();
        addInitialCuisines();
        addInitialDrinks();
    }

    public void addCuisine(String name) {
        cuisines.add(new Cuisine(name));
    }

    public void addDrink(String name, double price) {
        drinks.add(new Drink(name, price));
    }

    public void addDessert(String cuisineName, String dessertName, double dessertPrice) {
        for (Cuisine c : cuisines) {
            if(c.getName().equals(cuisineName)) {
                c.getDesserts().add(new Dessert(dessertName, dessertPrice));
                return;
            }
        }
        System.out.println("Cuisine not found");
    }

    public void addMainCourse(String cuisineName, String mainCourseName, double mainCoursePrice) {
        for (Cuisine c : cuisines) {
            if(c.getName().equals(cuisineName)) {
                c.getMainCourses().add(new MainCourse(mainCourseName, mainCoursePrice));
                return;
            }
        }
        System.out.println("Cuisine not found");
    }

    public void displayCuisines() {
        System.out.println("Main courses");
        for (Cuisine c : cuisines) {
            System.out.println(c.getName());
            ArrayList<MainCourse> mainCourses = c.getMainCourses();
            for (MainCourse m : mainCourses) {
                System.out.println(m.getName() + ", " + m.getPrice());
            }
        }
        System.out.println();
    }

    public void displayDesserts() {
        System.out.println("Desserts");
        for (Cuisine c : cuisines) {
            System.out.println(c.getName());
            ArrayList<Dessert> desserts = c.getDesserts();
            for (Dessert d : desserts) {
                System.out.println(d.getName() + ", " + d.getPrice());
            }
        }
        System.out.println();
    }

    public void displayDrinks() {
        System.out.println("Drinks");
        for (Drink d : drinks) {
            System.out.println(d.getName() + ", " + d.getPrice());
        }
    }

    public void displayLunch() {
        displayCuisines();
        displayDesserts();
    }

    public ArrayList<Cuisine> getCuisines() {
        return cuisines;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public MainCourse findMainCourse(String name) {
        for (Cuisine c : cuisines) {
            ArrayList<MainCourse> mainCourses = c.getMainCourses();
            for (MainCourse m : mainCourses) {
                if (m.getName().equals(name)) {
                    return m;
                }
            }
        }
        return null;
    }

    public Dessert findDessert(String name) {
        for (Cuisine c : cuisines) {
            ArrayList<Dessert> desserts = c.getDesserts();
            for (Dessert d : desserts) {
                if (c.getName().equals(name)) {
                    return d;
                }
            }
        }
        return null;
    }

    public Drink findDrink(String name) {
        for (Drink d : drinks) {
            if (d.getName().equals(name)){
                return d;
            }
        }
        return null;
    }
}
