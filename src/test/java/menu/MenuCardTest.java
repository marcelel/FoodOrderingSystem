package menu;

import cuisines.Cuisine;
import dishes.Dessert;
import dishes.Drink;
import dishes.MainCourse;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by marcel on 15.02.17.
 */
public class MenuCardTest {

    private MenuCard menuCard = new MenuCard();

    @Test
    public void findMainCourse() throws Exception {
        menuCard.addMainCourse("Polish", "Pizza", 30);
        assertEquals("Pizza", menuCard.findMainCourse("Pizza").getName());
        assertEquals(30, menuCard.findMainCourse("Pizza").getPrice(), 0.01);
    }

    @Test
    public void findDessert() throws Exception {
        menuCard.addDessert("Polish", "Ice cream", 10);
        assertEquals("Ice cream", menuCard.findDessert("Ice cream").getName());
        assertEquals(10, menuCard.findDessert("Ice cream").getPrice(), 0.01);
    }

    @Test
    public void findDrink() throws Exception {
        menuCard.addDrink("Cola", 6);
        assertEquals("Cola", menuCard.findDrink("Cola").getName()   );
        assertEquals(6, menuCard.findDrink("Cola").getPrice(), 0.01);

    }

    @Test
    public void addCuisine() throws Exception {
        menuCard.addCuisine("English");
        Cuisine foundCuisine = null;
        ArrayList<Cuisine> cuisines = menuCard.getCuisines();
        for (Cuisine c : cuisines) {
            if (c.getName().equals("English")){
                foundCuisine = c;
            }
        }
        assertEquals("English", foundCuisine.getName());
    }

    @Test
    public void addDrink() throws Exception {
        menuCard.addDrink("Cola", 5);
        Drink foundDrink = null;
        ArrayList<Drink> drinks = menuCard.getDrinks();
        for (Drink d : drinks) {
            if (d.getName().equals("Cola")) {
                foundDrink = d;
            }
        }
        assertEquals("Cola", foundDrink.getName());
        assertEquals(5, foundDrink.getPrice(), 0.01);
    }

    @Test
    public void addDessert() throws Exception {
        menuCard.addDessert("Polish", "Dessert4", 20);
        Dessert foundDessert = null;
        ArrayList<Dessert> desserts = menuCard.getCuisines().get(0).getDesserts();
        for (Dessert d : desserts)  {
            if (d.getName().equals("Dessert4")) {
                foundDessert = d;
            }
        }
        assertEquals("Dessert4", foundDessert.getName());
        assertEquals(20, foundDessert.getPrice(), 0.01);
    }

    @Test
    public void addMainCourse() throws Exception {
        menuCard.addMainCourse("Polish", "MainCourse4", 20);
        MainCourse foundMainCourse = null;
        ArrayList<MainCourse> mainCourse = menuCard.getCuisines().get(0).getMainCourses();
        for (MainCourse m : mainCourse)  {
            if (m.getName().equals("MainCourse4")) {
                foundMainCourse = m;
            }
        }
        assertEquals("MainCourse4", foundMainCourse.getName());
        assertEquals(20, foundMainCourse.getPrice(), 0.01);
    }

    @Test
    public void getCuisines() throws Exception {
        assertEquals("Polish", menuCard.getCuisines().get(0).getName());
        assertEquals("Mexican", menuCard.getCuisines().get(1).getName());
        assertEquals("Italian", menuCard.getCuisines().get(2).getName());
    }

    @Test
    public void getDrinks() throws Exception {
        assertEquals("Drink0", menuCard.getDrinks().get(0).getName());
        assertEquals("Drink1", menuCard.getDrinks().get(1).getName());
        assertEquals("Drink2", menuCard.getDrinks().get(2).getName());
        assertEquals(5, menuCard.getDrinks().get(0).getPrice(), 0.01);
        assertEquals(10, menuCard.getDrinks().get(1).getPrice(), 0.01);
        assertEquals(15, menuCard.getDrinks().get(2).getPrice(), 0.01);
    }

}