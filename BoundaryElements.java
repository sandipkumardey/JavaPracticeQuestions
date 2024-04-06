import java.util.*;

public class BoundaryElements {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printBoundary(matrix);
    }

    public static void printBoundary(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < columns; i++) {
            System.out.print(matrix[0][i] + " ");
        }

        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][columns - 1] + " ");
        }

        if (rows > 1) {
            for (int i = columns - 2; i >= 0; i--) {
                System.out.print(matrix[rows - 1][i] + " ");
            }
        }

        if (columns > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }
}


/*
 * Approach:
Problem:

The problem aims to print the boundary elements of a given matrix.

Preface:

The program defines a method printBoundary() to print the boundary elements of a given matrix.

Logic:

Retrieve the number of rows and columns in the matrix.
Print the first row from left to right.
Print the last column from top to bottom (excluding the first and last elements).
If there are more than one row, print the last row from right to left (excluding the first and last elements).
If there are more than one column, print the first column from bottom to top (excluding the first and last elements).

Pseudocode:

1. Get the number of rows and columns in the matrix.
2. Print the first row from left to right.
3. Print the last column from top to bottom (excluding the first and last elements).
4. If there are more than one row, print the last row from right to left (excluding the first and last elements).
5. If there are more than one column, print the first column from bottom to top (excluding the first and last elements).

Time Complexity:

Retrieving matrix dimensions: O(1)
Printing boundary elements: O(rows + columns)

Output:
The program will output the boundary elements of the given matrix.
*/