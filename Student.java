public class Student {
    int age;          // instance variable
    static String school = "DLSU"; // class variable

    public static void main(String[] args) {
        int score = 95; // local variable
        System.out.println("Score: " + score);
        Student s = new Student();
        s.age = 18;
        System.out.println("Student Age: " + s.age);
        System.out.println("School: " + Student.school);
    }
}
