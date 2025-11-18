public class Learner {
    // instance variable
    String name;

    // constructor to initialize the instance variable
    public Learner(String studentName) {
        name = studentName;
    }

    // method to display the value
    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Learner s = new Learner("Cris");
        s.displayName();
    }
}
