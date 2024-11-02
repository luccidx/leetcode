package SortArrayByParity905;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr1 = {3,1,2,4};
        int[] arr2 = {0};
        System.out.println("Array "+ Arrays.toString(arr1)+" after sorting by Parity is : "+ Arrays.toString(sortArrayByParity(arr1)));
        System.out.println("Array "+ Arrays.toString(arr2)+" after sorting by Parity is : "+ Arrays.toString(sortArrayByParity(arr2)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int N = nums.length;
        for(int i=0;i<N;i++){
            if(nums[i]%2!=0){
                for(int j=i+1;j<N;j++){
                    if(nums[j]%2==0){
                        int temp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
        }
        return nums;
    }
}
