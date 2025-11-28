import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();

        System.out.println("Multiplication table of " + number + ":");

        // Loop to print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
}
