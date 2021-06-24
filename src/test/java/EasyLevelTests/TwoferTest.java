package EasyLevelTests;

import org.junit.Before;
import org.junit.Test;
import EasyLevel.Twofer;

import static org.junit.Assert.assertEquals;

public class TwoferTest {
    private Twofer twofer;

    @Before
    public void setup() {
        twofer = new Twofer();
    }

    @Test
    public void noNameGiven() {
        String input = null;
        String expected = "One for you, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }
    public void aNameIsGiven() {
        String input = "Jack";
        String expected = "One for Jack, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }

    @Test
    public void anotherNameIsGiven() {
        String input = "Grace";
        String expected = "One for Grace, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }

    @Test
    public void emptyString() {
        String input = "";
        String expected = "One for you, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }
}