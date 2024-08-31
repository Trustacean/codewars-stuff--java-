package trustacean;

import java.util.HashSet;
import java.util.Set;

public class Permutations {
    
    public static Set<String> singlePermutations(String s) {
        Set<String> result = new HashSet<>();
        if (s.length() == 1) {
            result.add(s);
            return result;
        }
        String anchor = s.substring(0, 1);
        String rest = s.substring(1);

        for (String permutation : singlePermutations(rest)) {
            for (int i = 0 ; i <= permutation.length(); i++) {
                result.add(permutation.substring(0, i) + anchor + permutation.substring(i));
            }
        }

        return result;
    }
}