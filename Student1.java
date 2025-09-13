/*4. Chaining Constructors

Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. 
Implement a default constructor and a parameterized constructor that takes all three instance variables.
Use constructor chaining to initialize the variables. Print the values of the variables.

 */
public class Student1 {

    int studentId;
    String studentName;
    char grade;

    // Default constructor
    Student1() {
        // Constructor chaining 
        this(0, "unknown", 'N');
    }

    // Parameterized constructor
    Student1(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

// Method to display student details
    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }




    public static void main(String[] args) {
        // Using default constructor
        Student1 s1 = new Student1();
        s1.display();

        // Using parameterized constructor
        Student1 s2 = new Student1(101, "Kuldeep", 'A');
        s2.display();
    }
}
