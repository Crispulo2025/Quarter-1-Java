public class ArraySumExample {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // array of integers

        int sum = 0; // variable to store the sum

        // loop through the array to calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
