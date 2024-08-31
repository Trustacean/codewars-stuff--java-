package trustacean;

public class Solution {
  public static double solution(int[] arr1, int[] arr2) {
    int result = 0;
    for (int i = 0; i < arr1.length; i++) {
      result += (arr1[i] - arr2[i]) * (arr1[i] - arr2[i]);
    }

    return (double) result / arr1.length;
  }
}