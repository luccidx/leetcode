# 884. Uncommon Words from Two Sentences

- Given two sentences `A` and `B`.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
- A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
- Return a list of all uncommon words.
- You may return the list in any order.

---
### Intuition and Approach
### Intuition and Approach

The goal is to find words that appear exactly once in one of the two given sentences and do not appear in the other sentence. To achieve this, we can use a `HashMap` to count the occurrences of each word in both sentences.

1. **Split Sentences**:
    - Split both sentences `s1` and `s2` into arrays of words.

2. **Count Word Frequencies**:
    - Use a `HashMap` to count the frequency of each word in both arrays.

3. **Identify Uncommon Words**:
    - Iterate through the keys of the `HashMap` and collect words that have a frequency of exactly one.

4. **Return Result**:
    - Convert the list of uncommon words to an array and return it.

This approach ensures that we efficiently count word frequencies and identify uncommon words with a time complexity of O(n), where n is the total number of words in both sentences. The space complexity is also O(n) due to the storage used by the `HashMap` and the result list.

### Complexity Analysis
- Time Complexity: O(n), where n is the total number of words in both sentences.
- Space Complexity: O(n), where n is the total number of words in both sentences.
- Here is the Java implementation of the approach:

```java
public String[] uncommonFromSentences(String s1, String s2) {
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
```