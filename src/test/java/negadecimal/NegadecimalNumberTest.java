package negadecimal;

import org.junit.Test;
import static org.junit.Assert.*;

public class NegadecimalNumberTest {

    @Test
    public void testCanParseNegadecimalNumberCorrectly() {
        assertEquals(new NegadecimalNumber("71025"), new NegadecimalNumber(68985));
    }

}
