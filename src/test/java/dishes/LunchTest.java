package dishes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marcel on 15.02.17.
 */
public class LunchTest {

    private Lunch lunch = new Lunch(new MainCourse("Pizza", 25), new Dessert("Ice cream", 10));

    @Test
    public void getMainCourse() {
        MainCourse mainCourse = new MainCourse("Pizza", 25);
        assertEquals(mainCourse.getName(), lunch.getMainCourse().getName());
        assertEquals(mainCourse.getPrice(), lunch.getMainCourse().getPrice(), 0.01);
    }

    @Test
    public void getDessert() {
        Dessert dessert = new Dessert("Ice cream", 10);
        assertEquals(dessert.getName(), lunch.getDessert().getName());
        assertEquals(dessert.getPrice(), lunch.getDessert().getPrice(), 0.01);
    }

}