public class DocumentationExample {

    /**
     * Calculates the square of a given integer.
     * This method takes an integer value, multiplies it by itself,
     * and returns the resulting product.
     *
     * @param number the integer to be squared
     * @return the square of the given number
     */
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int value = 7;

        int result = square(value);

        System.out.println("The square of " + value + " is: " + result);
    }
}
