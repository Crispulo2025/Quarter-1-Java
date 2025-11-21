public class CheckEvenOdd {

    public static void main(String[] args) {

        // Declare and initialize a number
        int number = 7;

        // Check if the number is divisible by 2
        // If the remainder when divided by 2 is 0, the number is even
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } 
        // If the remainder is not 0, the number is odd
        else {
            System.out.println(number + " is odd");
        }
    }
}
