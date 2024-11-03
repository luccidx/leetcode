package FindPivotIndex724;

import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr1 = {1,7,3,6,5,6};
        int[] arr2 = {1,2,3};
        int[] arr3 = {2,1,-1};
        System.out.println("The Pivot Index for the Array "+ Arrays.toString(arr1)+ " is : "+pivotIndex(arr1));
        System.out.println("The Pivot Index for the Array "+ Arrays.toString(arr2)+ " is : "+pivotIndex(arr2));
        System.out.println("The Pivot Index for the Array "+ Arrays.toString(arr3)+ " is : "+pivotIndex(arr3));
    }
    public static int pivotIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(Leftsum(nums, i)==Rightsum(nums,i)){
                return i;
            }
        }
        return -1;
    }

    public static int Leftsum(int[] nums, int i){
        int leftsum=0;
        if(i==0){
            leftsum=0;
        }else{
            for(int j=0;j<i;j++){
                leftsum += nums[j];
            }
        }
        return leftsum;
    }

    public static int Rightsum(int[] nums, int i){
        int rightsum=0;
        if(i==nums.length-1){
            rightsum=0;
        }else{
            for(int j=i+1;j<nums.length;j++){
                rightsum += nums[j];
            }
        }
        return rightsum;
    }


    //optimised code
    /*
    public static int pivotIndex(int[] nums) {
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
     */
}
