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
