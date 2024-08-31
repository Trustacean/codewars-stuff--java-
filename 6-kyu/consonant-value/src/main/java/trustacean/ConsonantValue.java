package trustacean;

public class ConsonantValue {
    public static int solve(final String s) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aiueo".indexOf(s.charAt(i)) != -1) {
                sum = 0;
            } else {
                sum += s.charAt(i) - 'a' + 2;
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

}