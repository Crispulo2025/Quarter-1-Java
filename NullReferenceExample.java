public class NullReferenceExample {
    public static void main(String[] args) {
        String text = null; // reference variable not pointing to any object

        if (text == null) {
            System.out.println("The reference variable 'text' is null.");
        } else {
            System.out.println("The text is: " + text);
        }

        // Uncommenting the following line would cause a NullPointerException
        // System.out.println(text.length());
    }
}
