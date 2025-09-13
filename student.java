/* 4. Chaining Constructors

Write a Java program to create a class called Student with 
instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor
that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.

 */


public class student {
    long studentId;
    String studentName;
    String grade;

    //default constructor
    student(){
        this.studentId=123;
        this.studentName="kuldeep";
        this.grade="A";
    
    }

    //parametrised constructor

     student(long STU_ID,String STU_N,String GD){
        this.studentId=STU_ID;
        this.studentName=STU_N;
        this.grade=GD;
    }
}
