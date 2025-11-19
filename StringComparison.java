public class StringComparison {
    public static void main(String[] args) {
        // create two String objects
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // compare using '=='
        if (str1 == str2) {
            System.out.println("str1 and str2 are the same using '=='.");
        } else {
            System.out.println("str1 and str2 are NOT the same using '=='.");
        }

        // compare using '.equals()'
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are the same using '.equals()'.");
        } else {
            System.out.println("str1 and str2 are NOT the same using '.equals()'.");
        }
    }
}
