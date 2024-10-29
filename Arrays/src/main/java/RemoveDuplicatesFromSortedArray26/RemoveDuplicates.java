package RemoveDuplicatesFromSortedArray26;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Length of array "+ Arrays.toString(nums1) +"after removing duplicates are : "+removeDuplicates(nums1));
        System.out.println("Length of array "+ Arrays.toString(nums2) +"after removing duplicates are : "+removeDuplicates(nums2));
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
