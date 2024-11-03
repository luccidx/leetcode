package FindtheMiddleIndexinArray1991;

import java.util.Arrays;

public class MiddleIndex {
    public static void main(String[] args) {
        int[] arr1 = {2,3,-1,8,4};
        int[] arr2 = {1,-1,4};
        int[] arr3 = {2,5};
        System.out.println("The Middle index for Array "+ Arrays.toString(arr1)+" is : "+findMiddleIndex(arr1));
        System.out.println("The Middle index for Array "+ Arrays.toString(arr2)+" is : "+findMiddleIndex(arr2));
        System.out.println("The Middle index for Array "+ Arrays.toString(arr3)+" is : "+findMiddleIndex(arr3));
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
