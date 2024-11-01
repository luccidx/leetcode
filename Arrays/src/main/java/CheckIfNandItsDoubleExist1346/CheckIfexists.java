package CheckIfNandItsDoubleExist1346;

import java.util.Arrays;

public class CheckIfexists {
    public static void main(String[] args) {
        int[] arr1 = {10,2,5,3};
        int[] arr2 = {3,1,7,11};
        System.out.println("Check N and its Double exist for"+ Arrays.toString(arr1)+" ? : "+checkIfExist(arr1));
        System.out.println("Check N and its Double exist for"+ Arrays.toString(arr2)+" ? : "+checkIfExist(arr2));
    }
    public static boolean checkIfExist(int[] arr) {
        int N = arr.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i] == 2*arr[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
