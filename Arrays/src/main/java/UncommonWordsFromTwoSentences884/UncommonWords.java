package UncommonWordsFromTwoSentences884;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class UncommonWords {
    public static void main(String[] args) {
        String A1 = "this apple is sweet";
        String B1 = "this apple is sour";
        String A2 = "apple apple";
        String B2 = "banana";
        System.out.println(Arrays.toString(uncommonFromSentences(A1, B1)));
        System.out.println(Arrays.toString(uncommonFromSentences(A2, B2)));

    }

    private static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] news1 = s1.split(" ");
        String[] news2 = s2.split(" ");

        for (String word : news1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : news2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
