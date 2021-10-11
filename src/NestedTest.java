import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Nested tests")
public class NestedTest {
    @BeforeAll
    static void setUpAllOuter() {
        System.out.println("--- before all in Outer---");
    }

    @BeforeEach
    void setUpEachOuter() {
        System.out.println("\tbefore each in Outer---");
    }

    @AfterAll
    static void tearDownAllOuter() {
        System.out.println("--- after all in Outer---");
    }

    @AfterEach
    void tearDownEachOuter() {
        System.out.println("\tafter each in Outer---");
    }

    @Test
    void testOuter1() {
        System.out.println("\t--- in testOuter1()");
    }

    @Test
    void testOuter2() {
        System.out.println("\t--- in testOuter2()");
    }

    @Nested
    @DisplayName("Nested ArrayList")
    class ArrayListRelatedTests {
        List<String> list;

        @BeforeEach
        void setUp() {
            System.out.println("\t\tbefore each in NestedAl");
            list = Arrays.asList("one", "two", "three");
        }

        @AfterEach
        void tearDown() {
            System.out.println("\t\tafter each in NestedAl");
        }

        @Test
        void testAlNotNull() {
            System.out.println("\t\t--- in testAlNotNull");
            assertNotNull(list);
        }

        @Test
        void testAlSize() {
            System.out.println("\t\t--- in testAlSize");
            assertEquals(3, list.size());
        }
    }

    @Nested
    @DisplayName("Nested SetList")
    class TreeSetRelatedTests {
        Set<String> set;

        @BeforeEach
        void setUp() {
            System.out.println("\t\tbefore each in NestedSet");
            set = new TreeSet(Arrays.asList("one", "two", "two"));
        }

        @AfterEach
        void tearDown() {
            System.out.println("\t\tafter each in NestedSet");
        }

        @Test
        void testSetNotNull() {
            System.out.println("\t\t--- in testSetNotNull");
            assertNotNull(set);
        }

        @Test
        void testSetSize() {
            System.out.println("\t\t--- in testSetSize");
            assertEquals(2, set.size());
        }
    }

}
