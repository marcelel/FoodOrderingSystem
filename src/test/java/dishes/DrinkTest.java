package dishes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marcel on 15.02.17.
 */
public class DrinkTest {

    private Drink drink = new Drink("Cola", 5);

    @Test
    public void isIceCubes() throws Exception {
        assertEquals(false, drink.isIceCubes());
    }

    @Test
    public void isLemon() throws Exception {
        assertEquals(false, drink.isLemon());
    }

    @Test
    public void makeChoice() throws Exception {
        assertEquals(false, drink.makeChoice(0));
    }

    @Test
    public void makeChoiceIceCube() throws Exception {
        assertEquals(true, drink.makeChoice(1));
        assertEquals(true, drink.isIceCubes());
    }

    @Test
    public void makeChoiceLemon() throws Exception {
        assertEquals(true, drink.makeChoice(2));
        assertEquals(true, drink.isLemon());
    }

    @Test
    public void makeChoiceBoth() throws Exception {
        drink = new Drink("Cola", 5);
        assertEquals(true, drink.makeChoice(3));
        assertEquals(true, drink.isIceCubes());
        assertEquals(true, drink.isLemon());
    }

}
