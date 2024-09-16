### 14. Longest Common Prefix

### Description
Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".

### Intuition
The problem requires finding the longest common prefix among a list of strings. A common prefix is a substring that appears at the beginning of all the strings in the list. If no such prefix exists, the result should be an empty string. The simplest approach is to compare characters of the strings one by one until a mismatch is found.

### Approach
1. **Initialization**: Start with an empty result string.
2. **Edge Case**: If the input array is empty, return the empty result string.
3. **Character Comparison**:
    - Iterate through each character of the first string.
    - For each character, compare it with the corresponding character in all other strings.
    - If a mismatch is found or the end of any string is reached, return the result string built so far.
    - If no mismatch is found, append the character to the result string.
4. **Return Result**: After iterating through all characters of the first string, return the result string.

```java
private static String longestCommonPrefix(String[] strs) {
    StringBuilder res = new StringBuilder();
    if (strs.length == 0) {
        return res.toString();
    }
    for(int i=0;i<strs[0].length();i++){
        for (String s : strs) {
            if (i >= s.length() || s.charAt(i) != strs[0].charAt(i)) {
                return res.toString();
            }
        }
        res.append(strs[0].charAt(i));
    }
    return res.toString();
}
```

### Time Complexity
- **O(n \* m)**: The outer loop runs for the length of the first string, which is `m`. The inner loop runs for each string in the array, which is `n`. Therefore, the time complexity is O(n \* m), where `n` is the number of strings and `m` is the length of the first string.

### Space Complexity
- **O(1)**: The space complexity is constant because the only extra space used is for the `StringBuilder` and a few variables, which do not scale with the input size.