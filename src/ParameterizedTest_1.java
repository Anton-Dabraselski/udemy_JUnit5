import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTest_1 {

    @ParameterizedTest
    @ValueSource(strings = {"13516", "xybvuyxv", "s"})
    void testLength_Greater_Than_zero(String arg) {
        assertTrue(arg.length() > 0);
    }

}
