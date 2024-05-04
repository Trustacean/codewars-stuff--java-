package trustacean;

import java.util.ArrayList;
import java.util.List;

public class RemovedNumbers {

    public static List<long[]> removNb(long n) {
        long sum = n * (n + 1) / 2;
        List<long[]> result = new ArrayList<>();

        for (long i = 1; i <= n; i++) {
            long j = (sum - i) / (i + 1);
            if (j <= n && i * j == sum - i - j) {
                result.add(new long[] {i, j});
            }
        }

        return result;
    }
}
