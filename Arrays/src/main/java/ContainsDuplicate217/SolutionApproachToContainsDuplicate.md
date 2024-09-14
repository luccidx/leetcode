# Solution Approach for ContainsDuplicate.java

The solution to determine if an array contains any duplicates involves the following steps:

1. **Initialize a Set**: 
   - A `HashSet` is used to store unique elements from the array. Sets inherently do not allow duplicate values.

2. **Iterate through the Array**:
   - Loop through each element in the array.

3. **Check for Duplicates**:
   - For each element, check if it already exists in the `HashSet`.
   - If it does, return `true` indicating that a duplicate is found.
   - If it does not, add the element to the `HashSet`.

4. **Return Result**:
   - If the loop completes without finding any duplicates, return `false`.

This approach ensures that the solution is efficient with a time complexity of O(n), where n is the number of elements in the array, due to the average O(1) time complexity for both the `contains` and `add` operations in a `HashSet`.

## Code Example

```java
private static Boolean Dupli(int[] nums) {
    Set<Integer> Uniq = new HashSet<>();
    for (int num : nums) {
        if (Uniq.contains(num)) {
            return true;
        }
        Uniq.add(num);
    }
    return false;
}
```

---

The time and space complexity of the `Dupli` method in `ContainsDuplicate.java` are as follows:

### Time Complexity
- **O(n)**: The method iterates through the array once, performing constant-time operations (checking and adding elements) for each element. Here, `n` is the number of elements in the array.

### Space Complexity
- **O(n)**: In the worst case, all elements in the array are unique, and the `HashSet` will store all `n` elements. Thus, the space required is proportional to the number of elements in the array.

---
Written with help from : [GitHub Copilot](https://copilot.github.com/)

```