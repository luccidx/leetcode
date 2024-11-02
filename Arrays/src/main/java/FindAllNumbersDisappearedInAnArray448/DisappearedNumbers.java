package FindAllNumbersDisappearedInAnArray448;

import java.util.*;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,7,8,2,3,1};
        int[] arr2 = {1,1};
        System.out.println("The Numbers which are Disappeared in Array "+ Arrays.toString(arr1)+" is: "+findDisappearedNumbers(arr1));
        System.out.println("The Numbers which are Disappeared in Array "+ Arrays.toString(arr2)+" is: "+findDisappearedNumbers(arr2));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : nums) set.add(i);

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)) result.add(i);
        }
        return result;
    }
}
