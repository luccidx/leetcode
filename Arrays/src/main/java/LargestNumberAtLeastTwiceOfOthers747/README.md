# LargNumTwice.java

This Java program finds the index of the largest number in an array that is at least twice as large as every other number in the array. If no such number exists, it returns -1.

## Intuition

The problem requires identifying the largest number in the array and verifying if it is at least twice as large as all other numbers. The challenge is to do this efficiently.

## Approach

The solution involves the following steps:

1. **Find the Largest Number**:
   - Iterate through the array to find the largest number and its index.

2. **Verify the Condition**:
   - Iterate through the array again to check if the largest number is at least twice as large as every other number.

## Solution

### Main Method

The `main` method demonstrates the usage of the `dominantIndex` method with example arrays.

### Dominant Index Method

The `dominantIndex` method implements the logic to find the index of the largest number that is at least twice as large as every other number in the array.

## Time Complexity

- **O(n)**: The method iterates through the array twice, resulting in linear time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables.

## Usage

To run the program, execute the `main` method in the `LargNumTwice` class. You can modify the input arrays to test different cases.

```java
package LargestNumberAtLeastTwiceOfOthers747;

import java.util.Arrays;

public class LargNumTwice {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 1, 0};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("The Largest Number at least twice of others in array " + Arrays.toString(arr1) + " is : " + dominantIndex(arr1));
        System.out.println("The Largest Number at least twice of others in array " + Arrays.toString(arr2) + " is : " + dominantIndex(arr2));
    }

    public static int dominantIndex(int[] nums) {
        int maxNum = 0;
        int N = nums.length;
        int maxIndex = 0;

        for (int i = 0; i < N; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                maxIndex = i;
            }
        }

        int m = maxNum / 2;
        for (int i = 0; i < N; i++) {
            if (nums[i] == maxNum) {
                continue;
            }
            if (nums[i] > m) {
                return -1;
            }
        }
        return maxIndex;
    }
}