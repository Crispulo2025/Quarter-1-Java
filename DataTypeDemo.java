public class DataTypeDemo {
    public static void main(String[] args) {
        try {
            // Expecting an integer argument
            int number = Integer.parseInt(args[0]);
            System.out.println("You entered the number: " + number);
        
            // Expecting a double argument
            double value = Double.parseDouble(args[1]);
            System.out.println("You entered the double: " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Not enough command-line arguments provided.");
        } catch (NumberFormatException e) {
            System.out.println("Error: One of the arguments has the wrong data type.");
        }
    }
}