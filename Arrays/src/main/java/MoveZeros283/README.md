# MoveZeros.java

This Java program moves all zeroes in an array to the end while maintaining the relative order of the non-zero elements.

## Intuition

The problem requires moving all zeroes in an array to the end without changing the order of non-zero elements. The challenge is to do this in-place with minimal additional space and in linear time.

## Approach

The solution involves the following steps:

1. **Initial Check**:
    - If the array length is 1 or 0, print the array and return immediately.

2. **Count Zeroes**:
    - Iterate through the array and count the number of zeroes.
    - For each non-zero element, move it to the correct position by shifting it left by the number of zeroes encountered so far.

3. **Fill Zeroes**:
    - After all non-zero elements have been moved, fill the remaining positions in the array with zeroes.

## Solution

### Main Method

The `main` method demonstrates the usage of the `moveZeroes` method with example arrays.

### Move Zeroes Method

The `moveZeroes` method implements the logic to move all zeroes to the end of the array while maintaining the order of non-zero elements.

## Time Complexity

- **O(n)**: The method iterates through the array once, resulting in linear time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables and performs the operation in-place.

## Usage

To run the program, execute the `main` method in the `MoveZeros` class. You can modify the input arrays to test different cases.

```java
package MoveZeros283;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        int[] arr2 = {0};
        System.out.println("Array " + Arrays.toString(arr1) + " post moving zeros is : ");
        moveZeroes(arr1);
        System.out.println("Array " + Arrays.toString(arr2) + " post moving zeros is : ");
        moveZeroes(arr2);
    }

    public static void moveZeroes(int[] nums) {
        int N = nums.length;

        if (N == 1 || N == 0) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        int numofzeros = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] == 0) numofzeros++;
            else nums[i - numofzeros] = nums[i];
        }

        for (int i = 1; i <= numofzeros; i++) {
            nums[N - i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}