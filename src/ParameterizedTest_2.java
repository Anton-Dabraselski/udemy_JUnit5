import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTest_2 {

//    @ParameterizedTest
//    @CsvSource({"QWERTY,qwerty", "12345,12345"})
//    void testToLowerCase(String arg, String lowered) {
//        assertEquals(lowered, arg.toLowerCase());
//    }

    @ParameterizedTest(name = "The string {0} is {1} chars in length")
    @CsvFileSource(resources = "myFile.csv")
    void testToLowerCase(String arg, int length) {
        assertEquals(length, arg.length());
    }
}
