# MiddleIndex.java

This Java program finds the middle index of an array where the sum of the elements to the left of the index is equal to the sum of the elements to the right of the index.

## Intuition

The problem requires finding an index in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. The challenge is to do this efficiently.

## Approach

The solution involves the following steps:

1. **Calculate Total Sum**:
   - Calculate the total sum of the array.

2. **Iterate Through the Array**:
   - Use a running sum to keep track of the sum of elements to the left of the current index.
   - For each index, check if the running sum is equal to the total sum minus the running sum minus the current element.

## Solution

### Main Method

The `main` method demonstrates the usage of the `findMiddleIndex` method with example arrays.

### Find Middle Index Method

The `findMiddleIndex` method implements the logic to find the middle index in the array.

## Time Complexity

- **O(n)**: The method iterates through the array once to calculate the total sum and once to find the middle index, resulting in linear time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables.

## Usage

To run the program, execute the `main` method in the `MiddleIndex` class. You can modify the input arrays to test different cases.

```java
package FindtheMiddleIndexinArray1991;

import java.util.Arrays;

public class MiddleIndex {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, -1, 8, 4};
        int[] arr2 = {1, -1, 4};
        int[] arr3 = {2, 5};
        System.out.println("The Middle index for Array " + Arrays.toString(arr1) + " is : " + findMiddleIndex(arr1));
        System.out.println("The Middle index for Array " + Arrays.toString(arr2) + " is : " + findMiddleIndex(arr2));
        System.out.println("The Middle index for Array " + Arrays.toString(arr3) + " is : " + findMiddleIndex(arr3));
    }

    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
```