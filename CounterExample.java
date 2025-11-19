public class CounterExample {

    // static variable to track number of objects
    static int objectCount = 0;

    // constructor increments the count each time an object is created
    public CounterExample() {
        objectCount++;
    }

    public static void main(String[] args) {
        // create objects
        CounterExample obj1 = new CounterExample();
        CounterExample obj2 = new CounterExample();
        CounterExample obj3 = new CounterExample();

        // display total number of objects created
        System.out.println("Number of objects created: " + CounterExample.objectCount);
    }
}
