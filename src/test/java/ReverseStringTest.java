import org.junit.Before;
import org.junit.Test;
import reverseString.ReverseString;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    private ReverseString reverseString;

    @Before
    public void setup() { reverseString = new ReverseString();
    }

    @Test
    public void testAnEmptyString() {
        String input = "";
        String expected = "";

        assertEquals(expected, reverseString.reverse(input));
    }

    @Test
    public void testAString() {
        String input = "hello";
        String expected = "olleh";

        assertEquals(expected, reverseString.reverse(input));
    }

    @Test
    public void testCodePoint() {
        String input = "\uD835\uDD38BC";
        String expected = "CB\uDD38\uD835";

        assertEquals(expected, reverseString.reverse(input));
    }

    @Test
    public void testStringWithCaps() {
        String input = "HelloWorld";
        String expected ="dlroWolleH";

        assertEquals(expected, reverseString.reverse(input));
    }

    @Test
    public void testStringWithPunctuations() {
        String input = "Hello!";
        String expected = "olleH";

        assertEquals(expected, reverseString.reverse(input));
    }
}
