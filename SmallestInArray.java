import java.util.Scanner;

public class SmallestInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        // Input the array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Assume the first element is the smallest
        int smallest = numbers[0];

        // Find the smallest value
        for (int i = 1; i < n; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Display the smallest value
        System.out.println("The smallest value in the array is: " + smallest);

        input.close();
    }
}
