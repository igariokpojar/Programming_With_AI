package day_01;

public class StringUtility {

    // reverse function using for loop
    public static String reverse(String str) {
        String reversed = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // isPalindrome function
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }
        // isPalindrome function which uses the reverse function
    public static boolean isPalindromeUsingReverse(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }
}









