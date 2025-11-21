public class SquareCalculator {

    /**
     * Calculates the square of a given integer.
     * This method multiplies the input number by itself and returns the result.
     *
     * @param number the integer to be squared
     * @return the square of the input number
     */
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int value = 7;

        // Call the square method and store the result
        int result = square(value);

        // Print the squared value
        System.out.println("The square of " + value + " is: " + result);
    }
}
