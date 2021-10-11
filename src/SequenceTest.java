import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;


public class SequenceTest {

//    @BeforeAll
//    static void initAll(TestInfo info){
//        System.out.println("in " + info.getDisplayName());
//        //System.out.println("Before all tests");
//    }
//
//    @AfterAll
//    static void destroyAll(TestInfo info){
//        System.out.println("in " + info.getDisplayName());
////        System.out.println("After all tests");
//    }


    @Test
    void test1(TestInfo info) {
        System.out.println("in " + info.getDisplayName());
    }
    @Test
    void hello(TestInfo info) {
        System.out.println("in " + info.getDisplayName());
    }
    @Test
    void hiThere(TestInfo info) {
        System.out.println("in " + info.getDisplayName());
    }

    @Test
    @DisplayName("When string in null, throw on NPE.") //аналогично если бы это сообщение было третим аргуметном в assertThrows
    void testException() {
        String string = null;
        assertThrows(NullPointerException.class, () -> string.length());
    }

    //@Test
    @RepeatedTest(name = "Repeated test", value = 5)
    void testRepeated() {
        System.out.println("in test Repeated...");
    }


}
