import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}

/*
 * 
Question:
What will be the output of the following code?

java
Copy code
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
Approach:
Problem:

The problem is to take input from the user and greet them by their name.

Preface:

The program takes input from the user for their name and greets them using their name.

Logic:

Initialize a Scanner object to take input from the user.
Prompt the user to enter their name.
Read the name entered by the user.
Print a greeting message using the entered name.

Pseudocode:
1. Initialize Scanner object.
2. Prompt user to enter their name.
3. Read the entered name.
4. Print a greeting message using the entered name.

Time Complexity:

Input: O(1)
Output: O(1)
Total: O(1)

Output:
The program will prompt the user to enter their name and then greet them using their name.
 */