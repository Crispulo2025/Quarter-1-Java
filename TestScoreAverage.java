import java.util.Scanner;

public class TestScoreAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int score;

        // Input 5 test scores
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter test score " + i + ": ");
            score = input.nextInt();
            total += score;
        }

        // Calculate the average
        double average = total / 5.0;

        // Display the result
        System.out.println("The average score is: " + average);

        input.close();
    }
}
