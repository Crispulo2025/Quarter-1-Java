public class BooleanLogicDemo {

    public static void main(String[] args) {

        // Declare boolean variables
        boolean isSunny = true;   // indicates if it is sunny
        boolean hasUmbrella = false; // indicates if the person has an umbrella

        // Logical AND operator: true only if both conditions are true
        if (isSunny && hasUmbrella) {
            System.out.println("It's sunny and you have an umbrella.");
        } else {
            System.out.println("Either it is not sunny or you don't have an umbrella.");
        }

        // Logical OR operator: true if at least one condition is true
        if (isSunny || hasUmbrella) {
            System.out.println("You can go outside.");
        } else {
            System.out.println("Better stay indoors.");
        }

        // Logical NOT operator: inverts the boolean value
        if (!isSunny) {
            System.out.println("It is not sunny today.");
        } else {
            System.out.println("It is sunny today.");
        }
    }
}
