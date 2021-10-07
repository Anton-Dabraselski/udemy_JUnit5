import java.util.NoSuchElementException;
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

    @Test
    public void testSize() {
        assertEquals(3, basket.getSize(), "Checking basket's size");
    }

    @Test
    public void testAdd() {
    	basket.add(new Fruit("Banana", 200));
        assertEquals(4, basket.getSize(), "Adding one more fruit to the basket");
    }

    @Test
    public void testRemove() {
    	basket.remove(orange);
        assertEquals(2, basket.getSize(),"Removing a fruit from the basket");
    }

    @Test
    public void testRemoveException() {
        assertThrows(NoSuchElementException.class, () -> basket.remove(new Fruit("Kiwi", 80)), "Removing a fruit from the basket");
    }
    
    @AfterEach
    public void destroy() {
    	basket.removeAll();
    }
}