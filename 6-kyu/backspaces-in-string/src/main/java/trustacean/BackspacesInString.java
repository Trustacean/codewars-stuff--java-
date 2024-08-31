package trustacean;

public class BackspacesInString {
    public String cleanString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (i == 0) {
                    s = s.substring(1);
                    i = -1;
                } else {
                    System.out.println(s);
                    s = s.substring(0, i - 1) + s.substring(i + 1);
                    i = i - 2;
                }
            }
        }

        return s;

    }
}