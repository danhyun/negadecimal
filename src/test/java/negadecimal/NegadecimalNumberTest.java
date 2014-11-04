package negadecimal;

import org.junit.Test;
import static org.junit.Assert.*;

public class NegadecimalNumberTest {

    @Test
    public void testParseStringCorrectly() {
        assertEquals(68985, new NegadecimalNumber("71025").decimalValue());
    }

    @Test
    public void testDecimalToNegadecimal() {
        assertEquals("71025", new NegadecimalNumber(68985).negadecimalValue());
    }

    @Test
    public void testEquality() {
        assertEquals("These two numbers should be equal",
                new NegadecimalNumber(68985), new NegadecimalNumber("71025"));
    }

}
