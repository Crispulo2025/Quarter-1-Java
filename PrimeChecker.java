import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Handle numbers less than 2
        if (number < 2) {
            System.out.println(number + " is NOT a prime number.");
        } else {
            boolean isPrime = true;

            // Check divisibility from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Display result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
            }
        }

        input.close();
    }
}
