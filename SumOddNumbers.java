public class SumOddNumbers {
    public static void main(String[] args) {

        int sum = 0;

        // Loop from 1 to 50
        for (int i = 1; i <= 50; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum += i;  // Add odd number to sum
            }
        }

        // Display the result
        System.out.println("The sum of odd numbers from 1 to 50 is: " + sum);
    }
}
