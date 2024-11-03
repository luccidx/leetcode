package LargestNumberAtLeastTwiceOfOthers747;

import java.util.Arrays;

public class LargNumTwice {
    public static void main(String[] args) {
        int[] arr1 = {3,6,1,0};
        int[] arr2 = {1,2,3,4};
        System.out.println("The Largest Number at least twice of others in array"+ Arrays.toString(arr1)+" is : "+dominantIndex(arr1));
        System.out.println("The Largest Number at least twice of others in array"+ Arrays.toString(arr2)+" is : "+dominantIndex(arr2));
    }
    public static int dominantIndex(int[] nums) {
        int maxNum = 0;
        int N = nums.length;
        int maxIndex =0;

        for(int i=0;i<N;i++){
            if(nums[i]>maxNum){
                maxNum = nums[i];
                maxIndex= i;
            }
        }

        int m = maxNum/2;
        for(int i=0;i<N;i++){
            if(nums[i]==maxNum){
                continue;
            }
            if(nums[i]>m){
                return -1;
            }
        }
        return maxIndex;
    }
}
