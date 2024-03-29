import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt(); // Read the integer entered by the user

        // Validate if the number is non-negative
        if (number < 0) {
            System.out.println("Error: Please enter a non-negative integer.");
        } else {
            // Calculate the factorial of the number
            long factorial = calculateFactorial(number);

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close(); // Close the Scanner object
    }

    // Method to calculate the factorial of a number
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i; // Multiply factorial by each number from 2 to n
            }
            return factorial;
        }
    }
}
