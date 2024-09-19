# PascalTriangle.java

This Java program generates Pascal's Triangle for a given number of rows. Pascal's Triangle is a triangular array of the binomial coefficients.

## Approach

The solution involves the following steps:

1. **Initialize Data Structures**:
   - Create a list of lists `pascal` to store the rows of Pascal's Triangle.

2. **Generate Rows**:
   - Iterate from `0` to `numRows - 1` to generate each row.
   - For each row, create a new list `row`.
   - Iterate from `0` to `i` to fill the current row:
     - If the current position is the first or last in the row, add `1`.
     - Otherwise, add the sum of the two elements directly above the current position from the previous row.

3. **Store and Return Result**:
   - Add the generated row to the `pascal` list.
   - After all rows are generated, return the `pascal` list.

## Example

For `numRows = 5`, the output will be:
> [ [1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1] ]

```java
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
```

## Time Complexity

- **O(n^2)**: The outer loop runs `numRows` times, and the inner loop runs up to `i` times for each row, resulting in a quadratic time complexity.

## Space Complexity

- **O(n^2)**: The space complexity is also quadratic because we store all the rows of Pascal's Triangle, which requires space proportional to the number of elements in the triangle.

## Usage

To run the program, execute the `main` method in the `PascalTriangle` class. You can modify the `numRows` variable to generate Pascal's Triangle for a different number of rows.

```java
public class PascalTriangle {
    public static void main(String[] args) {
        int numRows1 = 5;
        System.out.println("Pascal Triangle for numRows: " + numRows1 + " is : " + generatePascal(numRows1));
        int numRows2 = 1;
        System.out.println("Pascal Triangle for numRows: " + numRows2 + " is : " + generatePascal(numRows2));
    }
}