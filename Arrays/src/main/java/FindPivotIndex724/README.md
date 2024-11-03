# FindPivotIndex.java

This Java program finds the pivot index of an array where the sum of the elements to the left of the index is equal to the sum of the elements to the right of the index.

## Intuition

The problem requires finding an index in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. The challenge is to do this efficiently.

## Approach

The solution involves the following steps:

1. **Iterate Through the Array**:
   - For each index, calculate the sum of elements on the left and the sum of elements on the right.
   - Compare the left sum and right sum to determine if the current index is the pivot index.

## Solution

### Main Method

The `main` method demonstrates the usage of the `pivotIndex` method with example arrays.

### Pivot Index Method

The `pivotIndex` method implements the logic to find the pivot index in the array.

## Time Complexity

- **O(n^2)**: The method iterates through the array and calculates the left and right sums for each index, resulting in quadratic time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables.

## Usage

To run the program, execute the `main` method in the `FindPivotIndex` class. You can modify the input arrays to test different cases.

```java
package FindPivotIndex724;

import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 3, 6, 5, 6};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, -1};
        System.out.println("The Pivot Index for the Array " + Arrays.toString(arr1) + " is : " + pivotIndex(arr1));
        System.out.println("The Pivot Index for the Array " + Arrays.toString(arr2) + " is : " + pivotIndex(arr2));
        System.out.println("The Pivot Index for the Array " + Arrays.toString(arr3) + " is : " + pivotIndex(arr3));
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (Leftsum(nums, i) == Rightsum(nums, i)) {
                return i;
            } 
        }
        return -1;
    }

    public static int Leftsum(int[] nums, int i) {
        int leftsum = 0;
        if (i == 0) {
            leftsum = 0;
        } else {
            for (int j = 0; j < i; j++) {
                leftsum += nums[j];
            }
        }
        return leftsum;
    }

    public static int Rightsum(int[] nums, int i) {
        int rightsum = 0;
        if (i == nums.length - 1) {
            rightsum = 0;
        } else {
            for (int j = i + 1; j < nums.length; j++) {
                rightsum += nums[j];
            }
        }
        return rightsum;
    }
}
```

---
# Optimised O(N) Approach

This Java program finds the pivot index of an array where the sum of the elements to the left of the index is equal to the sum of the elements to the right of the index.

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

The `main` method demonstrates the usage of the `pivotIndex` method with example arrays.

### Pivot Index Method

The `pivotIndex` method implements the logic to find the pivot index in the array.

## Time Complexity

- **O(n)**: The method iterates through the array once to calculate the total sum and once to find the pivot index, resulting in linear time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables.

## Usage

To run the program, execute the `main` method in the `FindPivotIndex` class. You can modify the input arrays to test different cases.

```java
package FindPivotIndex724;

import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 3, 6, 5, 6};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, -1};
        System.out.println("The Pivot Index for the Array " + Arrays.toString(arr1) + " is : " + pivotIndex(arr1));
        System.out.println("The Pivot Index for the Array " + Arrays.toString(arr2) + " is : " + pivotIndex(arr2));
        System.out.println("The Pivot Index for the Array " + Arrays.toString(arr3) + " is : " + pivotIndex(arr3));
    }

    public static int pivotIndex(int[] nums) {
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