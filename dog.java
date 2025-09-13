/*2. Parameterized Constructor

Write a Java program to create a class called Dog with instance variables name and color.
 Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. 
 Print the values of the variables. 
 */


public class dog {
    String name;
    String color;

    //param__constructor

    dog(String N ,String C){
        name=N;
        color=C;
    }
    //DISPLAY
    void display()
    {
        System.out.println(name);
        System.out.println(color);
    }
    public static void main(String[] args) {
        //obj creation

         dog d= new dog("tommy", "yellow");
         d.display();
}
}