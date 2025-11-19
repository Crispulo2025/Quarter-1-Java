public class NullCheckExample {
    public static void main(String[] args) {
        String myString = null; // reference variable declared but not initialized

        if (myString == null) {
            System.out.println("The String variable is null.");
        } else {
            System.out.println("The String variable is not null: " + myString);
        }
    }
}
