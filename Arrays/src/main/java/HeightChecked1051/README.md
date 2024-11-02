# HeightChecker.java

This Java program counts the number of students who are not in the expected order of height.

## Intuition

The problem requires determining how many students are not standing in the expected order of height. The challenge is to do this efficiently by comparing the current order with the sorted order.

## Approach

The solution involves the following steps:

1. **Copy and Sort**:
   - Create a copy of the original array and sort it to get the expected order of heights.

2. **Count Mismatches**:
   - Iterate through the original and sorted arrays simultaneously and count the number of positions where the heights do not match.

## Solution

### Main Method

The `main` method demonstrates the usage of the `heightChecker` method with example arrays.

### Height Checker Method

The `heightChecker` method implements the logic to count the number of students not in the expected order of height.

## Time Complexity

- **O(n log n)**: The method sorts the array, resulting in a time complexity of O(n log n). Here, `n` is the number of elements in the array.

## Space Complexity

- **O(n)**: The space complexity is linear because the method creates a copy of the original array.

## Usage

To run the program, execute the `main` method in the `HeightChecker` class. You can modify the input arrays to test different cases.

```java
package HeightChecked1051;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 4, 2, 1, 3};
        int[] arr2 = {5, 1, 2, 3, 4};
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Number of students in " + Arrays.toString(arr1) + " who are not in expected order of height are : " + heightChecker(arr1));
        System.out.println("Number of students in " + Arrays.toString(arr2) + " who are not in expected order of height are : " + heightChecker(arr2));
        System.out.println("Number of students in " + Arrays.toString(arr3) + " who are not in expected order of height are : " + heightChecker(arr3));
    }

    public static int heightChecker(int[] heights) {
        int N = heights.length;
        int[] expectedheight = Arrays.copyOf(heights, N);
        Arrays.sort(expectedheight);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (heights[i] != expectedheight[i]) {
                count++;
            }
        }
        return count;
    }
}