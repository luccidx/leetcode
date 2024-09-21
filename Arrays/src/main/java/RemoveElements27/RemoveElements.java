package RemoveElements27;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int [] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println("The array is : "+ Arrays.toString(nums1)+ " and val is : "+val1);
        System.out.println("The number of elements after removing the val: "+removeElement(nums1, val1));
        System.out.println("The array is : "+ Arrays.toString(nums2)+ " and val is : "+val2);
        System.out.println("The number of elements after removing the val: "+removeElement(nums2, val2));
    }

    private static int removeElement(int[] nums, int val) {
        int bound = nums.length-1;
        int i = 0;
        while (i <= bound) {
            if (nums[i] == val) {
                swap(nums, i, bound);
                bound -= 1;
            } else {
                i += 1;
            }
        }
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /*
    This can be solved by another method instead os swapping, start replacing the array from start of index with the value that is not equal to val.

    public int removeElement2(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
     */
}
