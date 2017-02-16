package cuisines;

import dishes.Dessert;
import dishes.MainCourse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marcel on 15.02.17.
 */
public class CuisineTest {

    private Cuisine cuisine = new Cuisine("Polish");

    @Test
    public void addMainCourse() throws Exception {
        MainCourse mainCourse = new MainCourse("Pizza", 25);
        cuisine.addMainCourse("Pizza", 25);
        MainCourse mainCourse1InCuisine = cuisine.findMainCourse("Pizza");
        assertEquals(mainCourse1InCuisine.getName(), mainCourse.getName());
        assertEquals(mainCourse1InCuisine.getPrice(), mainCourse.getPrice(), 0.01);
    }

    @Test
    public void addDesserts() throws Exception {
        Dessert dessert = new Dessert("Ice cream", 10);
        cuisine.addDesserts("Ice cream", 10);
        Dessert dessertInCuisine = cuisine.findDessert("Ice cream");
        assertEquals(dessertInCuisine.getName(), dessert.getName());
        assertEquals(dessertInCuisine.getPrice(), dessert.getPrice(), 0.01);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Polish", cuisine.getName());
    }

}