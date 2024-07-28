package day_01;

import java.util.Arrays;

public class TabNine_1 {
    public static void main(String[] args) {

        int[] numbers = {10, 11, 12, 13, 15};

        System.out.println(numbers[2]);
        numbers[0] = 100;

        System.out.println(Arrays.toString(numbers));

        // only update the third last element of the array value to 14000
        numbers[numbers.length - 3] = 14000;

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------------------------");

    // create for loop through the array and print each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        // print each element  in array in reverse order
        System.out.println("\nReversed array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println("--------------------------------------------------------");

        // create a new array which contains the elements of the first array in reverse order
        int[] reversedArray = TabNine_2.reverse(numbers);
        System.out.println(Arrays.toString(reversedArray));












    }
}
