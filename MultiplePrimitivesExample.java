public class MultiplePrimitivesExample {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3; // multiple primitive variables declared in one line

        int sum = a + b + c;
        int product = a * b * c;
        int difference = b - a;
        int quotient = b / c;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference (b - a): " + difference);
        System.out.println("Quotient (b / c): " + quotient);
    }
}
