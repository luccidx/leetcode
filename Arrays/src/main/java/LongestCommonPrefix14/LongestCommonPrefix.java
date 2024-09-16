package LongestCommonPrefix14;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strsone = {"flower", "flow", "flight"};
        System.out.println("The longest Common Prefix in Array of Strings " + Arrays.toString(strsone) + " is : "+longestCommonPrefix(strsone));
        String[] strstwo = {"dog", "racecar", "car"};
        System.out.println("The longest Common Prefix in Array of Strings " + Arrays.toString(strstwo) + " is : "+longestCommonPrefix(strstwo));
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs.length == 0) {
            return res.toString();
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i >= s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return res.toString();
                }
            }
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}
