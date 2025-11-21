public class LargestOfThree {

    /*
       This program finds the largest of three numbers.
       The logic works by comparing the numbers step-by-step:
       1. First, we assume the first number is the largest.
       2. Then we compare it with the second number; if the second is larger,
          we update the largest value.
       3. Next, we compare the current largest value with the third number.
       4. After all comparisons, the variable 'largest' holds the biggest number,
          which we then print.
    */

    public static void main(String[] args) {

        int a = 25;
        int b = 40;
        int c = 10;

        int largest = a; // assume a is the largest

        if (b > largest) {
            largest = b; // b becomes the new largest
        }

        if (c > largest) {
            largest = c; // c becomes the new largest
        }

        System.out.println("The largest number is: " + largest);
    }
}
