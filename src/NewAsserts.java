import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class NewAsserts {

    @Test
    void test(){
        List<String> act = Arrays.asList("one", "two", "three");
        List<String> exp = new ArrayList<>(act);
//        Set<String> exp = new TreeSet<>(act);
        assertIterableEquals(exp, act);
    }

    @Test
    void assertLineMatch() {
        List<String> actualLines = Arrays.asList("Happy New Year 2021!".split(" "));
        assertLinesMatch(Arrays.asList("Happy", "New", "Year", "2021!") , actualLines);
    }


}
