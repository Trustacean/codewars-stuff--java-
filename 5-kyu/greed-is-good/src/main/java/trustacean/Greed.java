package trustacean;

public class Greed{
    public static int greedy(int[] dice){
      int [] count = new int[6];
      int [] weight1 = new int[] {100, 0, 0, 0, 50, 0};
      int [] weight3 = new int[] {1000, 200, 300, 400, 500, 600};
      int score = 0;
      for (int i : dice) count[i-1]++;

      for (int i = 0; i<count.length; i++) score+=(count[i]/3)*weight3[i]+(count[i]%3)*weight1[i];
      return score;
    }

  }