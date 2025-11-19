public class CharUnicodeExample {
    public static void main(String[] args) {
        char ch = 'A'; // declare a char variable

        // print the character
        System.out.println("Character: " + ch);

        // print the Unicode value by casting to int
        int unicode = (int) ch;
        System.out.println("Unicode value: " + unicode);
    }
}
