package trustacean;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class FindUniqTest {
    private static final double PRECISION = 0.0000000000001;
    
    @Test
    public void sampleTestCases() {
        assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}), PRECISION);
        assertEquals(2.0, Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}), PRECISION);
    }
}