class QuickSort {
    public static void main(String[] args) {
        int[] arr = {11, 3, 12, 81, 40, 90, 1, 8, 4, 55};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = split(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int split(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
 * Approach:

Problem:
The problem involves implementing the Quick Sort algorithm to sort an array of integers in ascending order.

Preface:
The program initializes an array of integers and sorts it using the quickSort() method. The quickSort() method recursively partitions the array and sorts its partitions using the split() method, which selects a pivot element and rearranges the array elements such that elements smaller than the pivot are on the left, and elements greater than the pivot are on the right.

Logic:

Define a method quickSort() to sort the array using the Quick Sort algorithm.
The quickSort() method partitions the array recursively using the split() method.
The split() method selects a pivot element, rearranges the array such that elements smaller than the pivot are on the left, and elements greater than the pivot are on the right.
The split() method returns the index of the pivot element.
Recursively call quickSort() on the left and right partitions of the array until the entire array is sorted.
Pseudocode:

Initialize an array of integers.
Call quickSort() method with the array, starting index (0), and ending index (length - 1).
Define quickSort() method:
a. If the starting index is less than the ending index:
- Partition the array using the split() method.
- Recursively call quickSort() on the left and right partitions.
Define split() method:
a. Select a pivot element.
b. Iterate through the array and rearrange elements such that elements smaller than the pivot are on the left and elements greater than the pivot are on the right.
c. Return the index of the pivot element.
Define swap() method to swap two elements in the array.

Time Complexity:
The time complexity of Quick Sort is O(n log n) on average and O(n^2) in the worst case, where n is the number of elements in the array.

Output:
The program will output the sorted array in ascending order.
 */
