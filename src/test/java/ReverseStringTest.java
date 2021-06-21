import org.junit.Test;
import reverseString.ReverseString;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    @Test
    public void testAnEmptyString() {
        String input = "";
        String expected = "";

        assertEquals(expected, new ReverseString().reverse(input));

    }
}
