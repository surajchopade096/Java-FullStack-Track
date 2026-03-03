import java.util.*;
public class operators {



//Arithmatic Operators

//Binary Operators
    public static void Binary() {
        int A=10;
        int B=5;
        System.out.println("Addition is = "+(A+B));
        System.out.println("Substraction is = " + (A-B));
        System.out.println("Multiplication is ="+(A*B));
    }

//UNARY Operator - 1)Pre-increment 2)Post-increment
    public static void unary() {
        //pre-increment
        int a=10;
        int b=++a;
        System.out.println(a); //11
        System.out.println(b); //11

        //post-increment
        int c=10;
        int d=c++;
        System.out.println(c); //11
        System.out.println(d); //10
    }




//Relational Operators

    //Relational 1 (==)
    public static void Rel1() {
        int a=10;
        int b=10;
        System.out.println((a==b));
    }  
    //Relational 2 (!=)
    public static void Rel2(){
        int a=10;
        int b=5;
        System.out.println(a!=b);
    }
    //Relational 3  (>)
    public static void Rel3(){
        int a=10;
        int b=5;
        System.out.println(a>b);
    }
    //Relational 4  (<)
    public static void Rel4(){
        int a=20;
        int b=50;
        System.out.println(a<b);
    }
    //Relational 5  (>=)
    public static void Rel5(){
        int a=10;
        int b=10;
        System.out.println(a>=b);
    }
    //Relational 6 (<=)
    public static void Rel6(){
        int a=25;
        int b=25;
        System.out.println(a<=b);
    }



//Logical Operators

    //Logical 1 (&&)
    public static void Logical1(){
        System.out.println((3>2)&&(5>0));
    }
    //Logical 2 (||)
    public static void Logical2(){
        System.out.println((3<2)||(5<0));
    }
    //Logical 3 (!)
    public static void Logical3(){
        System.out.println(!(3>2));
    }




//Assignment Operator

    public static void Assign() {
        int A=10;
        A+=10;
        System.out.println(A);

        int B=10;
        B-=10;
        System.out.println(B);

        int C=10;
        C*=10;
        System.out.println(C);

        int D=10;
        D/=10;
        System.out.println(D);
    }

public static void main(String[] args) {
    
   Binary();
   unary();

   Rel1();
   Rel2();
   Rel3();
   Rel4();
   Rel5();
   Rel6();

   Logical1();
   Logical2();
   Logical3();

   Assign();

}
    
}
