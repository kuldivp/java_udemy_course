/*
1. Default Constructor
Write a Java program to create a class called "Cat" with instance variables name and age.
 Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
*/


// 1. Default Constructor
// Write a Java program to create a class called "Cat" with instance variables name and age.
// Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.

class w3r_1 {
    String name;
    int age;

    // Default constructor
    w3r_1() {
        name = "Unknown";
        age = 0;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        w3r_1 c = new w3r_1();
        c.printInfo();
    }
}
