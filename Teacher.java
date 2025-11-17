public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Subject: " + subject);
    }

    public void greet() {
        System.out.println("Hello, students!");
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Cruz", "Math");
        t.displayInfo();
        t.greet();
    }
}
