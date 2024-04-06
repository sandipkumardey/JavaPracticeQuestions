public class InterchangeElementsMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        interchange(matrix);

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void interchange(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][cols - 1];
            matrix[i][cols - 1] = temp;
        }
    }
}

/*
 * Approach:
Problem:

The problem is to interchange the first and last elements of each row in a given matrix.

Preface:

The program initializes a matrix, interchanges the first and last elements of each row, and then prints the modified matrix.

Logic:

The main method initializes a matrix and calls the interchange method to interchange the first and last elements of each row.
The interchange method iterates through each row of the matrix.
For each row, it swaps the first and last elements.
After the interchange, the main method prints the modified matrix.

Pseudocode:

1. Initialize a matrix.
2. Call interchange method to interchange first and last elements of each row.
3. Iterate through each row of the matrix:
   - Swap the first and last elements.
4. Print the modified matrix.

Time Complexity:

Interchanging elements: O(n), where n is the number of rows in the matrix.

Output:
The program will output the modified matrix where the first and last elements of each row are interchanged.
 */