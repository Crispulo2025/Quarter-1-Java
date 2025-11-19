public class FruitList {
    public static void main(String[] args) {
        // declare and initialize an array of Strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};

        // print each element using a for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + (i + 1) + ": " + fruits[i]);
        }
    }
}
