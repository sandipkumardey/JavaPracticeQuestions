import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the names to be sorted, separated by spaces:");
        String input = scan.nextLine();
        String[] names = input.split(" ");
        bubbleSort(names);
        System.out.println("Sorted names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
        scan.close();
    }

    public static void bubbleSort(String[] names) {
        int n = names.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (names[j].compareTo(names[j+1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
    }
}

/*
 * Approach:

Problem:
The problem involves sorting an array of names in alphabetical order using the bubble sort algorithm.

Preface:
The program prompts the user to enter a list of names separated by spaces. It then splits the input string into individual names and sorts them alphabetically using the bubble sort algorithm.

Logic:

Define a method bubbleSort() to sort an array of names using the bubble sort algorithm.
Iterate through the array and compare adjacent names.
If the current name is lexicographically greater than the next name, swap them.
Continue this process until the array is sorted.
Print the sorted array of names.

Pseudocode:

Prompt the user to enter names separated by spaces.
Split the input string into individual names and store them in an array.
Call the bubbleSort() method to sort the array of names.
Define bubbleSort() method:
a. Iterate through the array using nested loops.
b. Compare adjacent names and swap them if necessary to ensure alphabetical order.
c. Continue this process until the array is sorted.
Print the sorted array of names.
Time Complexity:
The time complexity of bubble sort is O(n^2), where n is the number of names in the array.

Output:
The program will output the names sorted in alphabetical order.
 */