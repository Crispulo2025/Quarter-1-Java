public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // array of int values

        int sum = 0;
        for (int num : numbers) { // iterate through the array
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
