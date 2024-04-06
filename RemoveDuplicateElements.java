import java.util.*;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};
        int[] result = removeDuplicates(arr);
        System.out.println("Array with duplicates: " + Arrays.toString(arr));
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}

/*
 * Approach:

Problem:
The problem involves removing duplicate elements from an array.

Preface:
The program takes an integer array as input and removes any duplicate elements from it using the removeDuplicates() method.

Logic:

Define a method removeDuplicates() to remove duplicate elements from the given integer array.
Use a HashSet to store unique elements of the array.
Iterate through the array and add each element to the HashSet.
Create a new array with the size of the HashSet to store unique elements.
Iterate through the HashSet and populate the new array with unique elements.
Return the new array containing unique elements.

Pseudocode:

Define an integer array to store the original array.
Call removeDuplicates() method with the original array.
Define removeDuplicates() method:
a. Initialize a HashSet to store unique elements.
b. Iterate through the original array and add each element to the HashSet.
c. Create a new integer array with the size of the HashSet.
d. Iterate through the HashSet and populate the new array with unique elements.
e. Return the new array.
Time Complexity:
The time complexity of removing duplicate elements is O(n), where n is the size of the original array.

Output:
The program will output the original array with duplicates and the array without duplicates.
 */