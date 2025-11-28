import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        double totalPrice = 0;
        double price;

        // Input price of each item and calculate total
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            price = input.nextDouble();
            totalPrice += price;
        }

        // Input tax rate (as percentage)
        System.out.print("Enter tax rate (in %): ");
        double taxRate = input.nextDouble();

        // Calculate total price including tax
        double totalWithTax = totalPrice + (totalPrice * taxRate / 100);

        // Display total price
        System.out.println("Total price including tax: " + totalWithTax);

        input.close();
    }
}
