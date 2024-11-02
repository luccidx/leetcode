package MoveZeros283;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr1 = {0,1,0,3,12};
        int[] arr2 = {0};
        System.out.println("Array "+ Arrays.toString(arr1) +" post moving zeros is : ");
        moveZeroes(arr1);
        System.out.println("Array "+ Arrays.toString(arr2) +" post moving zeros is : ");
        moveZeroes(arr2);
    }
    public static void moveZeroes(int[] nums) {
        int N= nums.length;

        if(N == 1 || N==0) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        int numofzeros=0;
        for(int i=0;i<N;i++){
            if(nums[i]==0) numofzeros++;
            else nums[i-numofzeros] = nums[i];
        }

        for(int i=1;i<=numofzeros;i++){
            nums[N-i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
