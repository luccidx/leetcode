# ValidMountainArray.java

This Java program checks if a given array is a valid mountain array. A valid mountain array is defined as an array that:

1. Has at least 3 elements.
2. There exists some index `i` (0 < i < arr.length - 1) such that:
   - `arr[0] < arr[1] < ... < arr[i]`
   - `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`

## Intuition

The problem requires determining if an array first strictly increases to a peak and then strictly decreases. The challenge is to do this efficiently in linear time.

## Approach

The solution involves the following steps:

1. **Initial Check**:
   - If the array length is less than 3, return `false`.

2. **Walk Up**:
   - Use a pointer to iterate through the array while the next element is greater than the current element.

3. **Peak Check**:
   - Ensure the pointer is not at the start or end of the array, which would mean there is no valid peak.

4. **Walk Down**:
   - Continue iterating through the array while the next element is less than the current element.

5. **Final Check**:
   - Ensure the pointer has reached the end of the array, confirming a valid mountain array.

## Solution

### Main Method

The `main` method demonstrates the usage of the `validMountainArray` method with example arrays.

### Valid Mountain Array Method

The `validMountainArray` method implements the logic to check if the array is a valid mountain array.

## Time Complexity

- **O(n)**: The method iterates through the array once, resulting in linear time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables and performs the operation in-place.

## Usage

To run the program, execute the `main` method in the `ValidMountainArray` class. You can modify the input arrays to test different cases.

```java
package ValidMountainArray941;

import java.util.Arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 1};
        int[] arr2 = {3, 5, 5};
        int[] arr3 = {0, 3, 2, 1};
        int[] arr4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr5 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr6 = {1, 3, 2};

        System.out.println("Is the array : " + Arrays.toString(arr1) + " a valid Mountain Array ? : " + validMountainArray(arr1));
        System.out.println("Is the array : " + Arrays.toString(arr2) + " a valid Mountain Array ? : " + validMountainArray(arr2));
        System.out.println("Is the array : " + Arrays.toString(arr3) + " a valid Mountain Array ? : " + validMountainArray(arr3));
        System.out.println("Is the array : " + Arrays.toString(arr4) + " a valid Mountain Array ? : " + validMountainArray(arr4));
        System.out.println("Is the array : " + Arrays.toString(arr5) + " a valid Mountain Array ? : " + validMountainArray(arr5));
        System.out.println("Is the array : " + Arrays.toString(arr6) + " a valid Mountain Array ? : " + validMountainArray(arr6));
    }

    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // Walk up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) return false;

        // Walk down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}