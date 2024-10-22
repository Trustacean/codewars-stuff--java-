/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trustacean;

/**
 *
 * @author Trustacean
 */

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        String hex = "";
        hex += toHex(r);
        hex += toHex(g);
        hex += toHex(b);
        return hex;
    }

    private static String toHex(int r) {
        String hex = "";
        if (r <= 0) {
            hex += "00";
        } else if (r >= 255) {
            hex += "FF";
        } else {
            hex += Integer.toHexString(r).toUpperCase();
        }
        return hex.length() > 1 ? hex : "0" + hex;
    }
}
