// Main class that calls the method from MathOperations
public class CallMethodDemo {

    public static void main(String[] args) {

        // Create an object of the MathOperations class
        MathOperations mathOp = new MathOperations();

        // Call the addNumbers method using the object and pass arguments
        // The method returns the sum, which is stored in the variable 'result'
        int result = mathOp.addNumbers(10, 20);

        // Print the result
        System.out.println("The sum is: " + result);
    }
}