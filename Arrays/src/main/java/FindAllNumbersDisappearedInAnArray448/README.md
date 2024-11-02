# DisappearedNumbers.java

This Java program finds all the numbers that are missing from an array containing numbers from 1 to n.

## Intuition

The problem requires finding all numbers in the range from 1 to n that do not appear in the given array. The challenge is to do this efficiently in terms of time and space.

## Approach

The solution involves the following steps:

1. **Use a Set for Tracking**:
   - Use a set to track the numbers that appear in the array.

2. **Identify Missing Numbers**:
   - Iterate through the range from 1 to n and check which numbers are not in the set.

## Solution

### Main Method

The `main` method demonstrates the usage of the `findDisappearedNumbers` method with example arrays.

### Find Disappeared Numbers Method

The `findDisappearedNumbers` method implements the logic to find all the numbers that are missing from the array.

## Time Complexity

- **O(n)**: The method iterates through the array and the range from 1 to n, resulting in linear time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(n)**: The space complexity is linear because the method uses a set to track the numbers that appear in the array.

## Usage

To run the program, execute the `main` method in the `DisappearedNumbers` class. You can modify the input arrays to test different cases.

```java
package FindAllNumbersDisappearedInAnArray448;

import java.util.*;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] arr2 = {1, 1};
        System.out.println("The Numbers which are Disappeared in Array " + Arrays.toString(arr1) + " is: " + findDisappearedNumbers(arr1));
        System.out.println("The Numbers which are Disappeared in Array " + Arrays.toString(arr2) + " is: " + findDisappearedNumbers(arr2));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : nums) set.add(i);

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) result.add(i);
        }
        return result;
    }
}