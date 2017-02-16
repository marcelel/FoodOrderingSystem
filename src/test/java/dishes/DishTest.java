package dishes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marcel on 15.02.17.
 */
public class DishTest {

    private Dish dish = new Dish("Cola", 5);

    @Test
    public void testgetName() throws Exception {
        assertEquals("Cola", dish.getName());
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(5, dish.getPrice(), 0.01);
    }
}