package trustacean;

public class RomanNumerals {
  private static final String[] ROMAN_NUMERALS = {
      "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
  };

  private static final int[] ARABIC_NUMERALS = {
      1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
  };

  public static String toRoman(int n) {
    String romanNumeral = "";

    for (int i = 0; i < ARABIC_NUMERALS.length; i++) {
      while (n >= ARABIC_NUMERALS[i]) {
        romanNumeral += ROMAN_NUMERALS[i];
        n -= ARABIC_NUMERALS[i];
      }
    }

    return romanNumeral;
  }

  public static int fromRoman(String romanNumeral) {
    int n = 0;
    
    for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
      while (romanNumeral.startsWith(ROMAN_NUMERALS[i])) {
        n += ARABIC_NUMERALS[i];
        romanNumeral = romanNumeral.substring(ROMAN_NUMERALS[i].length());
      }
    }
    
    return n;
  }
}