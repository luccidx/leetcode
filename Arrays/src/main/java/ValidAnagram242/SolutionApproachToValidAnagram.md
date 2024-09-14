# Solution Approaches for Valid Anagram

## Approach 1: Using HashMap

1. **Check Length**:
    - First check if the length of the two strings are equal or not. If not, return false.

2. **Initialize HashMap**:
    - Initialize a `HashMap` to store the frequency of each character in the first string `s`.

3. **Update Frequency**:
    - Iterate through the first string and update the frequency of each character in the `HashMap`.

4. **Check Second String**:
    - Iterate through the second string `t` and check if the character exists in the `HashMap`.

5. **Character Not Found**:
    - If the character does not exist or the frequency is 0, return false.

6. **Decrement Frequency**:
    - If the character exists, decrement the frequency in the `HashMap`.

7. **Return Result**:
    - If the loop completes without returning false, return true.

### Complexity
- **Time Complexity**: `O(n)`, where n is the length of the strings.
- **Space Complexity**: `O(1)`, since the `HashMap` will store at most 26 characters.

## Approach 2: Using Sorting

1. **Check Length**:
    - First check if the length of the two strings are equal or not. If not, return false.

2. **Sort Strings**:
    - Sort the characters of both strings.

3. **Compare Strings**:
    - Compare the sorted strings to check if they are equal.

4. **Return Result**:
    - If the sorted strings are equal, return true; otherwise, return false.

### Complexity
- **Time Complexity** : `O(n log n)` The time complexity is dominated by the sorting step. Sorting the characters of both strings takes O(n log n) time, where n is the length of the strings.

- **Space Complexity**: `O(1)` The space complexity is constant because the sorting is done in place, and no additional data structures are used that scale with the input size.

---
Written with help from : [GitHub Copilot](https://copilot.github.com/)

```