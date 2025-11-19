public class MaxValueExample {
    public static void main(String[] args) {
        double[] numbers = {3.5, 7.2, 1.8, 9.6, 4.4}; // array of doubles

        double max = numbers[0]; // assume first element is the maximum

        // loop through the array to find the maximum value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}
