import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int vowelCount = 0;

        // Convert string to lowercase to simplify comparison
        String lowerText = text.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Display the number of vowels
        System.out.println("Number of vowels in the string: " + vowelCount);

        input.close();
    }
}
