public class removeLeadingZeros {
    public static void main(String[] args) {
        String str = "0001234000";
        String result = removeLeadingZeros(str);
        System.out.println("Original string: " + str);
        System.out.println("String after removing leading zeros: " + result);
    }

    public static String removeLeadingZeros(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                break;
            }
            index++;
        }
        return str.substring(index);
    }
}

/*
 * Approach:

Problem:
The problem involves removing leading zeros from a given string.

Preface:
The program takes a string as input and removes any leading zeros from it using the removeLeadingZeros() method.

Logic:

Define a method removeLeadingZeros() to remove leading zeros from the given string.
Iterate through the characters of the string.
Increment the index until a non-zero character is encountered.
Return the substring of the original string starting from the index where non-zero character is found.

Pseudocode:

Define a string variable to store the original string.
Call removeLeadingZeros() method with the original string.
Define removeLeadingZeros() method:
a. Initialize an index variable to 0.
b. Iterate through the characters of the string.
c. If the character is '0', increment the index.
d. Return the substring of the original string starting from the index.
Time Complexity:
The time complexity of removing leading zeros is O(n), where n is the length of the string.

Output:
The program will output the original string and the string after removing leading zeros.
 */