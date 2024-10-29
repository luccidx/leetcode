package RansomNote383;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String[] ransomNote = {"a","aa","aa"};
        String[] magazine = {"b","ab","aab"};
        System.out.println("Can ransomNote "+ransomNote[0]+" be created with magazine"+magazine[0]+" ? : "+canConstruct(ransomNote[0],magazine[0]));
        System.out.println("Can ransomNote "+ransomNote[1]+" be created with magazine"+magazine[1]+" ? : "+canConstruct(ransomNote[1],magazine[1]));
        System.out.println("Can ransomNote "+ransomNote[2]+" be created with magazine"+magazine[2]+" ? : "+canConstruct(ransomNote[2],magazine[2]));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hmMag = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            hmMag.put(c, hmMag.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (hmMag.getOrDefault(c, 0) <= 0) {
                return false;
            }
            hmMag.put(c, hmMag.get(c) - 1);
        }
        return true;
    }
}
