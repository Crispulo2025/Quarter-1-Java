public class NamesArray {
    public static void main(String[] args) {
        String[] names = {"Cris", "Anna", "Miguel"}; // String array of 3 names

        // loop through the array
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + ": " + names[i]);
        }
    }
}
