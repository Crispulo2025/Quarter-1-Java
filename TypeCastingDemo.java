public class TypeCastingDemo {

    public static void main(String[] args) {

        // Implicit type casting (widening conversion)
        // int can be automatically converted to double because double has a larger range
        int intNumber = 50;
        double doubleNumber = intNumber; // no explicit cast needed
        System.out.println("Implicitly cast int to double: " + doubleNumber);

        // Explicit type casting (narrowing conversion)
        // double cannot be directly assigned to int because it may cause loss of precision
        double pi = 3.14159;
        int intPi = (int) pi; // explicit cast required
        System.out.println("Explicitly cast double to int: " + intPi);

        // Explanation: Casting is necessary when converting between incompatible types
        // to prevent errors and to control how the conversion happens
    }
}
