package trustacean;

// import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
    @Test
    public void basicTests() {
        assertEquals(ConsonantValue.solve("zodiac"), 26 );
        assertEquals(ConsonantValue.solve("chruschtschov"), 80);
        
    }
}