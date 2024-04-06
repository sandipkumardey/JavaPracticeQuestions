import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

/*
 * Approach:

Problem:
The problem involves determining whether a given number is a perfect number or not.

Preface:
The program prompts the user to enter a number. It then checks if the entered number is a perfect number using the isPerfectNumber() method.

Logic:

Define a method isPerfectNumber() to check whether a given number is a perfect number.
Iterate through all possible divisors of the number up to half of the number.
For each divisor, check if it divides the number evenly. If so, add it to a sum.
If the sum of all divisors equals the number itself, return true; otherwise, return false.

Pseudocode:

Prompt the user to enter a number.
Check if the entered number is a perfect number using the isPerfectNumber() method.
Print the result.
Time Complexity:
The time complexity of checking whether a number is perfect or not is O(n/2), where n is the given number.

Output:
The program will output whether the entered number is a perfect number or not.
 */