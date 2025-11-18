public class ImplicitConversionExample {
    public static void main(String[] args) {
        int numInt = 10;
        double numDouble = 5.75;

        // implicit type conversion happens here: int → double
        double result = numInt + numDouble;

        System.out.println("Result: " + result);
    }
}
