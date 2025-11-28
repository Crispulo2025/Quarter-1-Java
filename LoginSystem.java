import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        // Predefined username and password
        String correctUsername = "admin";
        String correctPassword = "12345";

        Scanner input = new Scanner(System.in);

        // Ask user for username
        System.out.print("Enter username: ");
        String username = input.nextLine();

        // Ask user for password
        System.out.print("Enter password: ");
        String password = input.nextLine();

        // Validate credentials
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }

        input.close();
    }
}
