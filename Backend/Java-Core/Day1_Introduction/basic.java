import java.util.Scanner;
import java.util.*;

public class basic {

//Print Hallo world

    public static void hello() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


//Use of print stmt

    public static void print() {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        
    }
    


//Initialization of Variables
 
    public static void intialize() {
        int a = 10;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);
    }




//Data types

    public static void datatypes() {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        float number = 25;
        int numbeer = 34;

    }



//Taking input from user

    public static void userinput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
    }



//Taking input from user and print sum

    public static void sumofinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is : " + sum);
    }


    public static void main(String[] args) {
  

   hello();
   print();

   intialize();
   datatypes();

   userinput();
   sumofinput();

    }

}
