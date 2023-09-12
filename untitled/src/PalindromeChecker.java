import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        //main method that tells the user if the input is a palindrome
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String transformed = transformInput(input);

        boolean isPalindrome = checkPalindrome(transformed);
        String isOrNot = isPalindrome ? "" : "not ";
        System.out.println("The transformed input is " + isOrNot + "a palindrome.");
    }

    public static String transformInput(String input) {
        // return the input with commas and exclamation points removed
        return input.toLowerCase().replace(",", "").replace("!", "");
    }

    public static boolean checkPalindrome(String input) {
        // CheckPalindrome method that returns boolean value true or false
        String reversed = reverseString(input);
        // Simplified return statement to improve readability
        return input.equals(reversed);

    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            //iterates list in reverse order
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}