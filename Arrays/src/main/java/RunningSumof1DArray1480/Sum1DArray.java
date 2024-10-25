package RunningSumof1DArray1480;

import java.util.Arrays;

public class Sum1DArray {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        System.out.println("The running Sum Array of " + Arrays.toString(nums) + " is = "+ Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] resultArr = new int[nums.length];
        resultArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            resultArr[i] = resultArr[i-1] + nums[i];
        }
        return resultArr;
    }
}
