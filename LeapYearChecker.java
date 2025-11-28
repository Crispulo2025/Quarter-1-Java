import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a LEAP YEAR.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }

        input.close();
    }
}
