public class ArrayExample {

    public static void main(String[] args) {

        // Declare and initialize an array of integers
        // This array stores the scores of five students
        int[] scores = {85, 90, 78, 92, 88};

        // Print each element of the array along with its position
        for (int i = 0; i < scores.length; i++) {
            // scores[i] accesses the element at index i
            System.out.println("Score of student " + (i + 1) + ": " + scores[i]);
        }
    }
}
