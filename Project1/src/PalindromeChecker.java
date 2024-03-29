import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the string entered by the user

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close(); // Close the Scanner object
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces, punctuation, and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the string is a palindrome
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters at left and right positions don't match
            }
            left++;
            right--;
        }
        return true; // All characters matched, so it's a palindrome
    }
}
