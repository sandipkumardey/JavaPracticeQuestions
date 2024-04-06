import java.util.Scanner;
public class Determinant{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int determinant = calculateDeterminant(matrix);
        System.out.println("Determinant of the matrix is: " + determinant);

        scanner.close();
    }

    public static int calculateDeterminant(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        } else if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            int determinant = 0;
            for (int i = 0; i < matrix.length; i++) {
                determinant += Math.pow(-1, i) * matrix[0][i] * calculateDeterminant(getSubMatrix(matrix, 0, i));
            }
            return determinant;
        }
    }

    public static int[][] getSubMatrix(int[][] matrix, int rowToRemove, int colToRemove) {
        int subSize = matrix.length - 1;
        int[][] subMatrix = new int[subSize][subSize];
        int r = 0, c = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i == rowToRemove) continue;
            for (int j = 0; j < matrix.length; j++) {
                if (j == colToRemove) continue;
                subMatrix[r][c++] = matrix[i][j];
            }
            r++;
            c = 0;
        }
        return subMatrix;
    }
}

/*
 * Approach:
Problem:

The problem is to calculate the determinant of a square matrix using recursion.

Preface:

The program takes input from the user for the size and elements of a square matrix. It then calculates the determinant of the matrix using a recursive approach.

Logic:

Initialize a Scanner object to take input from the user.
Prompt the user to enter the size of the square matrix.
Create a square matrix based on the size entered by the user.
Prompt the user to enter the elements of the square matrix.
Calculate the determinant of the matrix using the calculateDeterminant() method.
Print the determinant of the matrix.
Close the Scanner object.
The calculateDeterminant() method recursively calculates the determinant of the matrix using the Laplace expansion method:
If the matrix size is 1x1, return the single element.
If the matrix size is 2x2, return the determinant using the formula for 2x2 matrices.
For larger matrices, iterate over the first row and recursively calculate the determinant of the submatrix obtained by removing the current element's row and column. Sum up the determinants of these submatrices with appropriate signs.

The getSubMatrix() method returns a submatrix obtained by removing a specified row and column from the original matrix.

Pseudocode:

1. Initialize Scanner object.
2. Prompt user to enter matrix size.
3. Create matrix of given size.
4. Prompt user to enter matrix elements.
5. Calculate determinant using recursion.
6. Print determinant.
7. Close Scanner.

calculateDeterminant(matrix):
1. If matrix size is 1x1, return single element.
2. If matrix size is 2x2, return determinant using formula.
3. For larger matrices, iterate over first row and recursively calculate determinant of submatrix by removing current element's row and column. Sum up determinants with appropriate signs.

getSubMatrix(matrix, rowToRemove, colToRemove):
1. Initialize submatrix of size (matrix.length - 1) x (matrix.length - 1).
2. Copy elements from original matrix to submatrix, excluding specified row and column.
3. Return submatrix.

Time Complexity:

Input: O(n^2)
Determinant Calculation: O(n!)
Total: O(n! + n^2)

Output:
The program will output the determinant of the entered square matrix.

 */