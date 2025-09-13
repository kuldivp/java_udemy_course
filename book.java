/*3. Constructor Overloading

Write a Java program to create a class called "Book" with instance variables title, author, and price. 
Implement a default constructor and two parameterized constructors:
One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor. */


public class book {
    
    String title;
    String author;
    double price;

    //default construct

    book(){
        title = "unknown";
        author ="unknown";
        price=0.0;
    }

    //parametrised constructor with 2 arguments

     book( String T, String A){
        title = T;
        author =A;
        price=0.0;
    }
   
    //parametrised constructor with 3 arguments

     book(String T, String A,double P){
        title = "unknown";
        author ="unknown";
        price=P;
    }

    void display(){
        System.out.println(title +" "+ author + " "+ price);
    }


 public static void main (String[] args){

  book b = new book("math","arihant");

  b.display();


 }






}
