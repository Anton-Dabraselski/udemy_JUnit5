import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

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

}
