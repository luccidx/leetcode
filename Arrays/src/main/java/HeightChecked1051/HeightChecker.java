package HeightChecked1051;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr1 = {1,1,4,2,1,3};
        int[] arr2 = {5,1,2,3,4};
        int[] arr3 = {1,2,3,4,5};
        System.out.println("Number osf students in "+Arrays.toString(arr1)+" who are not in expected order of height are : "+heightChecker(arr1));
        System.out.println("Number osf students in "+Arrays.toString(arr2)+" who are not in expected order of height are : "+heightChecker(arr2));
        System.out.println("Number osf students in "+Arrays.toString(arr3)+" who are not in expected order of height are : "+heightChecker(arr3));
    }

    public static int heightChecker(int[] heights) {
        int N = heights.length;
        int[] expectedheight = Arrays.copyOf(heights, N);
        Arrays.sort(expectedheight);
        int count=0;
        for(int i=0;i<N;i++){
            if(heights[i]!=expectedheight[i]){
                count++;
            }
        }
        return count;
    }
}
