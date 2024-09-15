# 392. Is Subsequence
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.<br>
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).<br>

- Example 1:
>Input: s = "abc", t = "ahbgdc"<br>
>Output: true
> 
- Example 2:

>Input: s = "axc", t = "ahbgdc"<br>
>Output: false


- Constraints:<br>
`0 <= s.length <= 100`<br>
`0 <= t.length <= 104`<br>
`s and t consist only of lowercase English letters.`<br>

---
# Intuition & Approach
- We can solve this problem by using two pointers.
- We can iterate through the string `t` and check if the character at the current index is equal to the character at the current index of string `s`.
- If the characters are equal, we can increment the pointer of string `s`.
- If the pointer of string `s` is equal to the length of string `s`, we can return `True`.
- If the pointer of string `s` is not equal to the length of string `s`, we can return `False`.
- The time complexity of this approach is `O(n)`, where `n` is the length of string `t`.
- The space complexity of this approach is `O(1)`.
- The code implementation of this approach is as follows:

```java
public boolean isSubsequence(String s, String t) {
    int i = 0, j = 0;
    while (i < s.length() && j < t.length()) {
        if (s.charAt(i) == t.charAt(j)) {
            i += 1;
        }
        j += 1;
    }
    return i == s.length();
}
```
---