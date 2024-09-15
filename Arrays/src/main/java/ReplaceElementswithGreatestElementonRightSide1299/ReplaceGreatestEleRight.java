package ReplaceElementswithGreatestElementonRightSide1299;

import java.util.Arrays;
public class ReplaceGreatestEleRight {
    public static void main(String[] args) {
        int[] arr1 = {17, 18, 5, 4, 6, 1};
        int[] arr2 = {400};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Array after replacing with greatest element on right side: " + Arrays.toString(replaceElements(arr1)));
        System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Array after replacing with greatest element on right side: " + Arrays.toString(replaceElements(arr2)));
        System.out.println("Original Array: " + Arrays.toString(arr3));
        System.out.println("Array after replacing with greatest element on right side: " + Arrays.toString(replaceElements(arr3)));
    }

    private static int[] replaceElements(int[] arr) {
        int rightMax = -1;
        int N = arr.length;
        
        for (int i = N - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = rightMax;
            rightMax = Math.max(rightMax, temp);
        }
        return arr;
    }
}
