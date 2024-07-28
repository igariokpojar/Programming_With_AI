package day_02;

public class Practice_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + ". " + getDayOfWeek(i));
        }
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + ". " + getDayOfWeek(i));
        }

        System.out.println("Is 13 a prime number? " + isPrime(13));

    }
        public static String getDayOfWeek(int index) {
            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            return daysOfWeek[index];
    }
    // create isPrime function to check if a number is prime or not

    public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
    }
}









