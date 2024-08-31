package trustacean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class SolutionTest {

    @Test public void example1() {
        assertEquals( new ArrayList<>(Arrays.asList("a")),
                      Permutations.singlePermutations("a").stream().sorted().collect(Collectors.toList()) );
    }
    
    @Test public void example2() {
        assertEquals( new ArrayList<>(Arrays.asList("ab","ba")),
                      Permutations.singlePermutations("ab").stream().sorted().collect(Collectors.toList()) );
    }
    
    @Test public void example3() {
        assertEquals( new ArrayList<>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                      Permutations.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()) );
    }
}