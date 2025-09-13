import java.util.Scanner;

public class method_creation {

    public int Add_Number(int a ,int b)
    {
        return a+b;
    }


    public static void  main(String[] args)
    {
         int num1,num2;
         Scanner scanner =new Scanner(System.in);
         System.out.println("enter the first number");
         num1 =scanner.nextInt();
           System.out.println("enter the f2nd number");
         num2 =scanner.nextInt();
        method_creation obj =new method_creation();
         int add=obj.Add_Number(num1,num2);
         System.out.println(add);
        
scanner.close();
    }





}
 
// public name(){


//     #function 1
//     #functio 2


//     publice static -void 
//     (string [ ] args){

//         name obj = new nmae();
//         obj.add,sub(sdsmsFS)
//     }



