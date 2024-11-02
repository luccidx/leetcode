# SortArrayByParity.java

This Java program sorts an array so that all even elements are at the beginning of the array, followed by all odd elements.

## Intuition

The problem requires sorting an array by parity, meaning all even numbers should come before all odd numbers. The challenge is to do this in-place with minimal additional space and in linear time.

## Approach

The solution involves the following steps:

1. **Two-Pointer Technique**:
   - Use two pointers, one starting from the beginning and the other from the end of the array.
   - Swap elements to ensure that even elements are moved to the front and odd elements to the back.

## Solution

### Main Method

The `main` method demonstrates the usage of the `sortArrayByParity` method with example arrays.

### Sort Array By Parity Method

The `sortArrayByParity` method implements the logic to sort the array by parity.

## Time Complexity

- **O(n)**: The method iterates through the array once, resulting in linear time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables and performs the operation in-place.

## Usage

To run the program, execute the `main` method in the `SortArrayByParity` class. You can modify the input arrays to test different cases.

```java
package SortArrayByParity995;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 2, 4};
        int[] arr2 = {0};
        System.out.println("Array " + Arrays.toString(arr1) + " after sorting by Parity is : " + Arrays.toString(sortArrayByParity(arr1)));
        System.out.println("Array " + Arrays.toString(arr2) + " after sorting by Parity is : " + Arrays.toString(sortArrayByParity(arr2)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int N = nums.length;
        int left = 0, right = N - 1;
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }
        return nums;
    }
}