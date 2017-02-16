package menu;

import dishes.Dessert;
import dishes.MainCourse;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;


/**
 * Created by marcel on 16.02.17.
 */
public class OrderTest {

    private Order order = new Order();

    @Test
    public void orderMainCourse() throws Exception {
        InputStream inputStream = new ByteArrayInputStream("PolishMainCourse0".getBytes());
        System.setIn(inputStream);
        MainCourse mainCourse = order.orderMainCourse();
        assertEquals("PolishMainCourse0", mainCourse.getName());
    }

    @Test
    public void orderDessert() throws Exception {
        InputStream inputStream = new ByteArrayInputStream("PolishDessert0".getBytes());
        System.setIn(inputStream);
        Dessert dessert = order.orderDessert();
        assertEquals("PolishDessert0", dessert.getName());
    }
}