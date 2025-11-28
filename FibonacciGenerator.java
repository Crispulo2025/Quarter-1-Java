import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input the number of Fibonacci numbers to generate
        System.out.print("Enter the value of N: ");
        int N = input.nextInt();

        // Check for valid input
        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long first = 0, second = 1;
            System.out.println("First " + N + " Fibonacci numbers:");

            for (int i = 1; i <= N; i++) {
                System.out.print(first + " ");

                // Compute the next number
                long next = first + second;
                first = second;
                second = next;
            }
        }

        input.close();
    }
}
