package ThirdMaximumNumber414;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr1 = {3,2,1};
        int[] arr2 = {1,2};
        int[] arr3 = {2,2,3,1};
        int[] arr4 = {1,1,2};
        System.out.println("Third Maxiumum Number is Array "+Arrays.toString(arr1)+" is : "+thirdMax(arr1));
        System.out.println("Third Maxiumum Number is Array "+Arrays.toString(arr2)+" is : "+thirdMax(arr2));
        System.out.println("Third Maxiumum Number is Array "+Arrays.toString(arr3)+" is : "+thirdMax(arr3));
        System.out.println("Third Maxiumum Number is Array "+Arrays.toString(arr4)+" is : "+thirdMax(arr4));
    }
    public static  int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]!=nums[i-1])
            {
                count++;
            }
            if(count==3)
            {
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}
