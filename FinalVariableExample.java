public class FinalVariableExample {
    public static void main(String[] args) {
        final int MAX_VALUE = 100; // final variable

        System.out.println("Initial value: " + MAX_VALUE);

        // Uncommenting the following line will cause a compile-time error
        // MAX_VALUE = 200; // Error: cannot assign a value to final variable

        // System.out.println("Updated value: " + MAX_VALUE);
    }
}
