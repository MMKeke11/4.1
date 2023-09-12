import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String transformed = transformInput(input);

        boolean isPalindrome = checkPalindrome(transformed);
        String isOrNot = isPalindrome ? "" : "not ";
        System.out.println("The transformed input is " + isOrNot + "a palindrome.");
    }

    public static String transformInput(String input) {
        // returns the input string with commas and exclamation points removed
        return input.toLowerCase().replace(",", "").replace("!", "");
    }

    // check input compared to reverseString()
    public static boolean checkPalindrome(String input) {
        return input.equals(reverseString(input));
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}