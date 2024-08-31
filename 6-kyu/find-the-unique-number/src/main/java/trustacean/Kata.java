package trustacean;

public class Kata {
    public static double findUniq(double arr[]) {
      if (arr[0]!=arr[1] && arr[0]!=arr[2]) return arr[0];
      for (double n : arr) if (n != arr[0]) return n;
      return 0;
    }
}