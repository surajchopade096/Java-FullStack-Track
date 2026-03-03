import java.util.Scanner;

public class cntrlstmt {
    

    //if-else statements

    public static void ifelse() {
        int age = 22;
        if (age >= 18) {
            System.out.println("Adult : Drive, Vote");
        } else {
            System.out.println("Not Adult");
        }
    }


    //Print the largest of 2
    public static void largest(){
        int A=1;
        int B=3;
        
        if ((A>=B) ) {
            System.out.println("A is Largest number");
        }
        else{
            System.out.println("B is Largest number");
        }
    }



    //Print the number is odd or even
    public static void oddeven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }




    // Income tax calculator
    
    public static void incometax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income : ");
        int income = sc.nextInt();
        int tax;

        if (income<=500000) {
            tax=0;
        }
        else if((income>500000) && (income<1000000) ){
            tax= (int) (income*0.2);  
        }
        else{
            tax= (int) (income*0.3);
        }
        System.out.println("YOUR TAX IS : "+ tax);
    }


    //Print the largest of 3

    public static void largestof3(){
        int a=1,b=3,c=5;

        if(a>=b & a>=c){
            System.out.println("Largest is : "+ a);
        }
        else if (b>=c) {
            System.out.println("Largest is "+ b);
        }
        else{
            System.out.println("Largest is :" + c);
        }

    }

    //calculator

    public static void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();
        System.out.println("Enter Operator : ");
        int operator = sc.next().charAt(0);
        int tax;
        
        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            
            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;
                 
            case '%':
                System.out.println(a%b);
                break;
            

            default:
                System.out.println("Wrong Operator");
                break;
        }

    }

    //Swapping of 2 numbers

    public static void swapping(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp=a;
            a=b;
            b=temp;
            System.out.println(a);
            System.out.println(b);

    }

    //parameter of rectangle 

    public static void para(){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        int c=a;
        int d=b;

        int add=a+b+c+d;
        System.out.println("The parameter of rectangle is : "+add);
    }


    public static void main(String[] args) {
   ifelse();

   largest();
   oddeven();

   incometax();
   largestof3();
   calculator();
   swapping();

   para();

    }
}
