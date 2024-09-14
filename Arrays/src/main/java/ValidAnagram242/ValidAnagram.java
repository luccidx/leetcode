package ValidAnagram242;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";

        System.out.println("Method 1: Using HashMap");
        System.out.println("Is " + s1 + " and " + t1 + " anagram? :" + isAnagram(s1, t1));
        System.out.println("Is " + s2 + " and " + t2 + " anagram? :" + isAnagram(s2, t2));
        System.out.println("\n");
        System.out.println("Method 2: Using Sorting");
        System.out.println("Is " + s1 + " and " + t1 + " anagram? :" + AnagramSort(s1, t1));
        System.out.println("Is " + s2 + " and " + t2 + " anagram? :" + AnagramSort(s2, t2));
    }

    //Method 1: using HashMap
    private static Boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    // Method 2: Using Sorting
    private static Boolean AnagramSort(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        java.util.Arrays.sort(s1);
        java.util.Arrays.sort(t1);
        return java.util.Arrays.equals(s1, t1);
    }
}
