# SqaureSort.java

This Java program squares each number in a sorted array and then sorts the resulting array.

## Intuition

The problem requires squaring each element in a sorted array and then sorting the squared values. The challenge is to do this efficiently.

## Approach

The solution involves the following steps:

1. **Easier Method**:
   - Square each element in the array.
   - Sort the squared array.

2. **Faster Method**:
   - Use a two-pointer technique to square and sort the array in one pass.

## Solution

### Main Method

The `main` method demonstrates the usage of the `sortedSquareseasier` and `sortedSquares` methods with example arrays.

### Sorted Squares Easier Method

The `sortedSquareseasier` method implements the logic to square each element and then sort the array.

### Sorted Squares Faster Method

The `sortedSquares` method implements the logic to square and sort the array using a two-pointer technique.

## Time Complexity

- **O(n log n)**: The `sortedSquareseasier` method sorts the array, resulting in a time complexity of O(n log n). Here, `n` is the number of elements in the array.
- **O(n)**: The `sortedSquares` method uses a two-pointer technique, resulting in linear time complexity.

## Space Complexity

- **O(1)**: The `sortedSquareseasier` method uses constant space.
- **O(n)**: The `sortedSquares` method uses additional space for the result array.

## Usage

To run the program, execute the `main` method in the `SqaureSort` class. You can modify the input arrays to test different cases.

```java
package SquaresOfaSortedArray977;

import java.util.Arrays;

public class SqaureSort {
    public static void main(String[] args) {
        int[] arr1 = {-4, -1, 0, 3, 10};
        int[] arr2 = {-7, -3, 2, 3, 11};
        System.out.println("Array " + Arrays.toString(arr1) + " after squared and sorted is : " + Arrays.toString(sortedSquareseasier(arr1)));
        System.out.println("Array " + Arrays.toString(arr2) + " after squared and sorted is : " + Arrays.toString(sortedSquares(arr2)));
    }

    // easier method
    public static int[] sortedSquareseasier(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    // faster code
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }
        return result;
    }
}