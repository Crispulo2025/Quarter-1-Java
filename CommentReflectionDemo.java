/*
    Comments are important in programming because they help explain what the code does,
    making it easier for others (and yourself) to understand when reading it later.
    They are useful for documenting logic, purpose of variables, and special instructions.

    Examples from previous code:
    1. In the MultiplyNumbers program, we used comments to explain each step:
       // Declare the first number
       // Multiply the two numbers

    2. In the EvenOddCheck program, comments explained the condition used to check
       if a number is even or odd:
       // Check if the number is divisible by 2

    3. In the TypeCastingDemo program, comments explained why explicit casting is necessary:
       // double cannot be directly assigned to int because it may cause loss of precision

    Without comments, the purpose of the code and the logic behind decisions
    may be unclear, especially in larger programs.
*/

public class CommentReflectionDemo {

    public static void main(String[] args) {

        // Example code: Multiply two numbers
        int num1 = 5; // first number
        int num2 = 10; // second number
        int product = num1 * num2; // multiply num1 and num2
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Example code: Check if a number is even or odd
        int number = 7; // number to check
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
