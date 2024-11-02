# ThirdMaximumNumber.java

This Java program finds the third maximum number in an array. If the third maximum does not exist, it returns the maximum number.

## Intuition

The problem requires finding the third distinct maximum number in an array. If there are fewer than three distinct numbers, the maximum number should be returned.

## Approach

The solution involves the following steps:

1. **Sort the Array**:
   - Sort the array in ascending order.

2. **Count Distinct Maximums**:
   - Iterate through the sorted array from the end, counting distinct numbers until the third distinct maximum is found.

## Solution

### Main Method

The `main` method demonstrates the usage of the `thirdMax` method with example arrays.

### Third Maximum Number Method

The `thirdMax` method implements the logic to find the third maximum number in the array.

## Example

## Time Complexity

- **O(n log n)**: The method sorts the array, resulting in a time complexity of O(n log n). Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables and performs the operation in-place.

## Usage

To run the program, execute the `main` method in the `ThirdMaximumNumber` class. You can modify the input arrays to test different cases.

```java
package ThirdMaximumNumber414;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1};
        int[] arr2 = {1, 2};
        int[] arr3 = {2, 2, 3, 1};
        int[] arr4 = {1, 1, 2};
        System.out.println("Third Maximum Number in Array " + Arrays.toString(arr1) + " is : " + thirdMax(arr1));
        System.out.println("Third Maximum Number in Array " + Arrays.toString(arr2) + " is : " + thirdMax(arr2));
        System.out.println("Third Maximum Number in Array " + Arrays.toString(arr3) + " is : " + thirdMax(arr3));
        System.out.println("Third Maximum Number in Array " + Arrays.toString(arr4) + " is : " + thirdMax(arr4));
    }

    public static int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
            if (count == 3) {
                return nums[i - 1];
            }
        }
        return nums[n - 1];
    }
}