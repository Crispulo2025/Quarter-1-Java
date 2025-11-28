import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        // Loop until a negative number is entered
        do {
            System.out.print("Enter a number (negative to stop): ");
            number = input.nextInt();

            if (number >= 0) {
                sum += number;  // Add to sum if non-negative
            }

        } while (number >= 0);

        // Display the total sum
        System.out.println("The total sum of entered numbers is: " + sum);

        input.close();
    }
}
