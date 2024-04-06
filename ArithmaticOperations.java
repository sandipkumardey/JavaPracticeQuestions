import java.util.Scanner;

public class ArithmaticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns for the matrix: ");
        int n = scanner.nextInt();
        double[][] matrix = new double[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = scanner.nextDouble();
        double normal = 0, trace = 0, determinant = 0;
        for (int i = 0; i < n; i++) {
            normal += matrix[i][i] * matrix[i][i];
            trace += matrix[i][i];
        }
        determinant = n == 2 ? matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0] : Double.NaN;
        normal = Math.sqrt(normal);
        System.out.println("Normal: " + normal);
        System.out.println("Trace: " + trace);
        System.out.println("Determinant: " + determinant);
        scanner.close();
    }
}


/*
 * Approach:
Problem:

The problem aims to calculate the normal, trace, and determinant of a square matrix based on user input.

Preface:

The program takes input from the user to create a square matrix of size 'n x n'. It then calculates the normal, trace, and determinant of the matrix.

Logic:

Initialize a Scanner object to take input from the user.
Prompt the user to enter the number of rows and columns for the matrix.
Create a 2D array 'matrix' of size 'n x n'.
Prompt the user to enter the elements of the matrix row-wise.
Calculate the normal by summing the squares of the diagonal elements.
Calculate the trace by summing the diagonal elements.
Calculate the determinant using the formula for 2x2 matrices.
Print the normal, trace, and determinant.
Close the Scanner object.

Pseudocode:

1. Initialize Scanner object.
2. Prompt user to enter matrix size.
3. Create matrix of given size.
4. Prompt user to enter matrix elements.
5. Calculate normal and trace.
6. Calculate determinant for 2x2 matrices.
7. Print normal, trace, and determinant.
8. Close Scanner.

Time Complexity:

Input: O(n^2)
Calculation of normal and trace: O(n)
Calculation of determinant: O(1)
Total: O(n^2)

Output:
The program will output the normal, trace, and determinant of the entered matrix.
 */