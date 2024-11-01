# CheckIfNandItsDoubleExist.java

This Java program checks if there exists two integers `N` and `M` in an array such that `N` is double `M` (i.e., `N = 2 * M`).

## Intuition

The problem requires checking if any element in the array is double another element. The challenge is to do this efficiently, ideally in linear time. The solution should ensure that the comparison is made correctly without comparing an element with itself.

## Approach

The solution involves the following steps:

1. **Nested Loop**:
   - Use two nested loops to iterate through the array.
   - For each element `arr[i]`, check if there exists another element `arr[j]` such that `arr[i] = 2 * arr[j]` and `i != j`.

2. **Return Result**:
   - If such a pair is found, return `true`.
   - If no such pair is found after checking all elements, return `false`.

## Solution

### Main Method

The `main` method demonstrates the usage of the `checkIfExist` method with example arrays.

### Check If Exist Method

The `checkIfExist` method implements the nested loop technique to check for the existence of the required pair.

## Example

For the input array `arr = [10, 2, 5, 3]`, the output will be: `True`

For the input array `arr = [3,1,7,11]`, the output will be: `False`

## Time Complexity

- **O(n^2)**: The method uses a nested loop to iterate through the array, resulting in a quadratic time complexity. Here, `n` is the number of elements in the array.

## Space Complexity

- **O(1)**: The space complexity is constant because the method uses only a few extra variables and performs the operation in-place.

## Usage

To run the program, execute the `main` method in the `CheckIfexists` class. You can modify the input arrays to test different cases.

```java
package CheckIfNandItsDoubleExist1346;

import java.util.Arrays;

public class CheckIfexists {
    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3};
        int[] arr2 = {3, 1, 7, 11};
        System.out.println("Check N and its Double exist for" + Arrays.toString(arr1) + " ? : " + checkIfExist(arr1));
        System.out.println("Check N and its Double exist for" + Arrays.toString(arr2) + " ? : " + checkIfExist(arr2));
    }

    public static boolean checkIfExist(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] == 2 * arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}