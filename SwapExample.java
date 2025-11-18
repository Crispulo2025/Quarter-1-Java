public class SwapExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a; // store a's value
        a = b;        // assign b's value to a
        b = temp;     // assign temp (old a) to b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
