/* Overloading Constructors with Different Data Types

Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

One constructor takes int parameters.
Another constructor takes double parameters.
Print the values of the variables for each constructor. */


public class Point {
    double x,y;

    //constructor to take int only

    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    //overloading to take double only 

     Point(double x,double y)
    {
        this.x=x;
        this.y=y;

    
    }

 
  void display() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String args[]){
         
        Point p1= new Point(3,6) ;
        Point p2= new Point(8.5,0.6) ;

    p1.display();
    p2.display();

    }

}
