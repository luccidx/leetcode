package ContainsDuplicate217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int []num1 = {1,2,3,1};
        int []num2 = {1,2,3,4};
        int []num3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println("Is "+ Arrays.toString(num1) + " contains duplicate? :" + Dupli(num1));
        System.out.println("Is "+ Arrays.toString(num2) + " contains duplicate? :" + Dupli(num2));
        System.out.println("Is "+ Arrays.toString(num3) + " contains duplicate? :" + Dupli(num3));
    }

    private static Boolean Dupli(int[] nums) {
        Set<Integer> Uniq = new HashSet<>();
        for (int num : nums) {
            if (Uniq.contains(num)) {
                return true;
            }
            Uniq.add(num);
        }
        return false;
    }
}
