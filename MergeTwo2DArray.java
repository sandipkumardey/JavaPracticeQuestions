public class MergeTwo2DArray {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{5, 6}, {7, 8}};

     
        int[][] mergedArray = mergeArrays(arr1, arr2);

        for (int[] row : mergedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] mergeArrays(int[][] arr1, int[][] arr2) {
        int rows = arr1.length + arr2.length;
        int cols = arr1[0].length;

        int[][] mergedArray = new int[rows][cols];

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i].clone();
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i].clone();
        }

        return mergedArray;
    }
}

/*
 * Approach:
Problem:

The problem is to merge two 2D arrays into a single 2D array.

Preface:

The program initializes two 2D arrays, merges them into a single 2D array using the mergeArrays method, and then prints the merged array.

Logic:

The main method initializes two 2D arrays arr1 and arr2.
It calls the mergeArrays method to merge arr1 and arr2 into a single 2D array mergedArray.
The mergeArrays method:
Calculates the number of rows and columns in the merged array.
Creates a new 2D array mergedArray with the calculated dimensions.
Copies each row from arr1 to mergedArray.
Copies each row from arr2 to mergedArray starting from the row after the last row of arr1.
After merging, the main method prints the elements of mergedArray.

Pseudocode:

1. Initialize two 2D arrays arr1 and arr2.
2. Call mergeArrays method to merge arr1 and arr2.
3. Calculate the number of rows and columns in the merged array.
4. Create a new 2D array mergedArray with the calculated dimensions.
5. Copy each row from arr1 to mergedArray.
6. Copy each row from arr2 to mergedArray starting from the row after the last row of arr1.
7. Print the elements of mergedArray.

Time Complexity:

Merging arrays: O(rows * cols), where rows and cols are the number of rows and columns in the merged array.

Output:
The program will output the merged array containing elements from both arr1 and arr2.
 */

