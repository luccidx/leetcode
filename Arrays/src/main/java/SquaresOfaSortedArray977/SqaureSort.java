package SquaresOfaSortedArray977;

import java.util.Arrays;

public class SqaureSort {
    public static void main(String[] args) {
        int[] arr1 = {-4,-1,0,3,10};
        int[] arr2 = {-7,-3,2,3,11};
        System.out.println("Array "+Arrays.toString(arr1)+" after squared and sorted is : "+ Arrays.toString(sortedSquareseasier(arr1)));
        System.out.println("Array "+Arrays.toString(arr2)+" after squared and sorted is : "+ Arrays.toString(sortedSquares(arr2)));
    }
    //easier method
    public static int[] sortedSquareseasier(int[] nums) {
        for(int i=0;i< nums.length; i++){
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
