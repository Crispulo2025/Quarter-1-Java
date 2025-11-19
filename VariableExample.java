public class VariableExample {
    // instance variable
    int number = 50;

    public void showNumber() {
        // local variable with the same name
        int number = 100;

        System.out.println("Local variable: " + number);       // prints 100
        System.out.println("Instance variable: " + this.number); // prints 50
    }

    public static void main(String[] args) {
        VariableExample obj = new VariableExample();
        obj.showNumber();
    }
}
