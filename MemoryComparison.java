public class MemoryComparison {
    public static void main(String[] args) {
        // primitive variable
        int num = 50;

        // reference variable (String object)
        String text = "Hello";

        // print values
        System.out.println("Primitive value: " + num);
        System.out.println("Reference value: " + text);

        // print memory info
        System.out.println("Memory info for primitive (cannot get actual address): " + num);
        System.out.println("Memory address of reference variable: " + System.identityHashCode(text));
    }
}
