import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Display values before swapping
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display values after swapping
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        input.close();
    }
}
