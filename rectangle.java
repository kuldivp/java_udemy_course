/* 
Copy Constructor

Write a Java program to create a class called Rectangle with instance variables length and width.
 Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object. 
 Print the values of the variables.

*/
public class rectangle {
    

int length;
int width;

//parametrized constructor

rectangle(int length,int width)
{
   this.length=length;
   this.width=width;
}

 // Copy constructor
    public rectangle(rectangle Rectangle) {
        
        this.length = Rectangle.length;
      
        this.width = Rectangle.width;
    }

 public static void main(String[] args) {
        // Create a new Rectangle object using the parameterized constructor
        rectangle rect1 = new rectangle(125, 45);
        // Print the values of the instance variables for rect1
        System.out.println("Rectangle 1 Length: " + rect1.length);
        System.out.println("Rectangle 1 Width: " + rect1.width);

        // Create a new Rectangle object using the copy constructor
        rectangle rect2 = new rectangle(rect1);
        // Print the values of the instance variables for rect2
        System.out.println("Rectangle 2 Length: " + rect2.length);
        System.out.println("Rectangle 2 Width: " + rect2.width);
    }



     
}
