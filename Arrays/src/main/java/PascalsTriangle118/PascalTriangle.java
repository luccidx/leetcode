package PascalsTriangle118;

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows1 = 5;
        System.out.println("Pascal Triangle for numRows: " + numRows1 + " is : " + generatePascal(numRows1));
        int numRows2 = 1;
        System.out.println("Pascal Triangle for numRows: " + numRows2 + " is : " + generatePascal(numRows2));

    }

    private static List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
