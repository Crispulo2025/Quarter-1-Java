public class EvenOddCheck {
    public static void main(String[] args) {
        int number = 15;

        // boolean variable to indicate if number is even
        boolean isEven = (number % 2 == 0);

        if (isEven) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
