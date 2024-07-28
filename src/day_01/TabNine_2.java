package day_01;

public class TabNine_2 {

    // create a utility method of the array named reverse
    public static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    // overload the reverse method to work with double array
    public static double[] reverse(double[] arr) {
        double[] reversedArray = new double[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }
    // overload the reverse method to work with string array
    public static String[] reverse(String[] arr) {
        String[] reversedArray = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }
    // overload the method using palindrome concept
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

   // create a utility method of the array named print which takes an array and prints its elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}








