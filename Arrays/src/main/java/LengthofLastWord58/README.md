# 58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.<br>
A word is a maximal substring consisting of non-space characters only.<br>

- Example 1:
>Input: s = "Hello World"<br>
>Output: 5<br>
>Explanation: The last word is "World" with length 5.

- Example 2:
>Input: s = "   fly me   to   the moon  "<br>
>Output: 4<br>
>Explanation: The last word is "moon" with length 4.

- Example 3:
>Input: s = "luffy is still joyboy"<br>
>Output: 6<br>
>Explanation: The last word is "joyboy" with length 6.<br>

- Constraints:

`1 <= s.length <= 104`<br>
`s consists of only English letters and spaces ' '.`<br>
`There will be at least one word in s.`

---
# Intuition and Approach
- Split the string by space and get the last element of the list.
- Return the length of the last element.
- Time complexity is O(n) and space complexity is O(n).
- The code implementation is as follows.

```java
public int lengthOfLastWord(String s) {
    String [] words = s.split(" ");
    if (words.length == 0) {
        return 0;
    }
    return words[words.length - 1].length();
}
```
---