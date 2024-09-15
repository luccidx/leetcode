package IsSubsequence392;

public class IsSubsequence {
    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";
        String s2 = "axc";
        String t2 = "ahbgdc";

        System.out.println("Is " + s1 + " subsequence of " + t1 + "?: " + isSubsequence(s1, t1));
        System.out.println("Is " + s2 + " subsequence of " + t2 + "?: " + isSubsequence(s2, t2));
    }

    private static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i += 1;
            }
            j += 1;
        }
        return i == s.length();
    }
}
