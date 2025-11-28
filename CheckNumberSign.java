import java.util.Scanner;

public class CheckNumberSign {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check the number
        if (number > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

        // Close the scanner
        input.close();
    }
}
