import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Disabled;
import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class FruitsBasketTest {

    private FruitsBasket basket = new FruitsBasket();
    private Fruit apple = new Fruit("Apple", 120); 
    private Fruit orange = new Fruit("Orange", 120); 
    private Fruit pear = new Fruit("Pear", 120); 

    @BeforeEach
    public void init() {
    	basket.add(apple);
    	basket.add(orange);
    	basket.add(pear);
    }

//    @Test
//    public void testSize() {
//        assertEquals(3, basket.getSize(), "Checking basket's size");
//    }
//
//    @Test
//    public void testAdd() {
//    	basket.add(new Fruit("Banana", 200));
//        assertEquals(4, basket.getSize(), "Adding one more fruit to the basket");
//    }
//
//    @Test
//    public void testRemove() {
//    	basket.remove(orange);
//        assertEquals(2, basket.getSize(),"Removing a fruit from the basket");
//    }
//
//    @Test
//    public void testRemoveException() {
//        assertThrows(NoSuchElementException.class, () -> basket.remove(new Fruit("Kiwi", 80)), "Removing a fruit from the basket");
//    }
//
//    @Test
//    void testForTimeout(){
//        assertTimeout(Duration.ofMillis(1), () -> Thread.sleep(1500), () ->"Testing for productivity");
//    }
//
//    @Test
//    void testForNull() {
//        basket = null;
//        assertNull(basket, "Checking if the basket is null");
//    }

    @Test
    void testForTruth() {
        List<Fruit> lot = Arrays.asList(new Fruit("Peach", 40), new Fruit("Apple", 10), new Fruit("Mango", 300));
        assertTrue(basket.addALot(lot), "Adding a lot of fruits.");
    }

    @AfterEach
    public void destroy() {
    	basket.removeAll();
    }

    @Test
    void testArrays() {
        String str = "Buon anno a tutti voi!";
        String[] exp = {"Buon", "anno", "a", "tutti", "voi"};
        String[] actual = basket.greet(str);
        assertArrayEquals(exp, actual);
    }

    @Disabled("Because it is just an illustration")
    void testDisabled() {
        System.out.println("Disabled test...");
    }


}