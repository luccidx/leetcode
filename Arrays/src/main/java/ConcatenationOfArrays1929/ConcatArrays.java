package ConcatenationOfArrays1929;

import java.util.Arrays;

public class ConcatArrays {
    public static void main(String[] args) {
        int []num1 = {1,2,1};
        int []num2 = {1,3,2,1};
        System.out.println("Concatenation of array: " + Arrays.toString(num1) + " with Itself is : "+ Arrays.toString(getConcatenation(num1)));
        System.out.println("Concatenation of array: " + Arrays.toString(num1) + " with Itself is : "+ Arrays.toString(getConcatenation(num2)));
    }

    private static int[] getConcatenation(int[] nums) {
        int N = nums.length;
        int []newNum = new int[N*2];

        for(int i=0;i<N;i++){
            newNum[i] = nums[i];
            newNum[i+N] = nums[i];
        }
        return newNum;
    }
}
