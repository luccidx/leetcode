package TwoSum1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int []num1 = {2, 7, 11, 15};
        int target1 = 9;
        int []num2 = {3, 2, 4};
        int target2 = 6;
        int []num3 = {3, 3};
        int target3 = 6;
        System.out.println("Two Sum of : " + Arrays.toString(num1) + " for Target " +target1+ " = " + Arrays.toString(twoSumHashmap(num1, target1)));
        System.out.println("Two Sum of : " + Arrays.toString(num2) + " for Target " +target2+ " = " + Arrays.toString(twoSumHashmap(num2, target2)));
        System.out.println("Two Sum of : " + Arrays.toString(num3) + " for Target " +target3+ " = " + Arrays.toString(twoSumHashmap(num3, target3)));
    }

    // Brute Force
    private static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if( nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }

    // Hashmap
    private static int[] twoSumHashmap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
