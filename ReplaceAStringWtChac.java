public class ReplaceAStringWtChac {
    public static void main(String[] args) {
        String str = "Hello, world!";
        char replacement = '*';
        int index = 7;

        String replacedString = replaceCharAtIndex(str, index, replacement);

        System.out.println("Original string: " + str);
        System.out.println("String after replacing character at index " + index + ": " + replacedString);
    }

    public static String replaceCharAtIndex(String str, int index, char replacement) {
        if (index < 0 || index >= str.length()) {
            return str;
        }

        char[] charArray = str.toCharArray();
        charArray[index] = replacement;

        return new String(charArray);
    }
}

/*
 * Approach:

Problem:
The problem involves replacing a character at a specific index in a given string with a new character.

Preface:
The program takes a string, a replacement character, and an index as input and replaces the character at the specified index with the replacement character using the replaceCharAtIndex() method.

Logic:

Define a method replaceCharAtIndex() to replace a character at the given index in the string with the specified replacement character.
Check if the index is within the bounds of the string. If not, return the original string.
Convert the string to a character array to modify individual characters.
Replace the character at the specified index with the replacement character.
Convert the modified character array back to a string and return it.

Pseudocode:

Define a string to store the original string.
Define an integer variable to store the index of the character to be replaced.
Define a character variable to store the replacement character.
Call the replaceCharAtIndex() method with the original string, index, and replacement character.
Define replaceCharAtIndex() method:
a. Check if the index is within the bounds of the string. If not, return the original string.
b. Convert the string to a character array.
c. Replace the character at the specified index with the replacement character.
d. Convert the character array back to a string and return it.
Time Complexity:
The time complexity of replacing a character at a specific index in a string is O(n), where n is the length of the string.

Output:
The program will output the original string and the string after replacing the character at the specified index.
 */
