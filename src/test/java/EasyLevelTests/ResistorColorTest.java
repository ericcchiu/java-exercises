package EasyLevelTests;

import EasyLevel.ResistorColor;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ResistorColorTest {

    private ResistorColor resistorColor;

    @Before
    public void setup() {
        resistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode() {
        String input = "Black";
        int expected = 0;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    @Ignore("Remove to run test")
    @Test
    public void testWhiteColorCode() {
        String input = "White";
        int expected = 9;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    @Ignore("Remove to run test")
    @Test
    public void testOrangeColorCode() {
        String input = "Orange";
        int expected = 3;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    @Ignore("Remove to run test")
    @Test
    public void testColors() {
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"));

        assertEquals(expected, resistorColor.colors());
    }

}
