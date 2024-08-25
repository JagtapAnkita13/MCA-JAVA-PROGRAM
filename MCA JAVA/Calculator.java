import java.util.*;
public class Calculator
{
    public static void main(String [] arg)
    {
        int Num1 = 0, Num2 = 0, Add, Sub, Mul, Mod;
        float Div;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter First Number : ");
        Num1 = sc.nextInt();

        System.out.print("\n Enter Second Number : ");
        Num2 = sc.nextInt();

        Add = Num1 + Num2;
        System.out.println(" \n Addition of Two Numbers is : "+ Add +" ");

        Sub = Num1 - Num2;
        System.out.println(" \n Sustraction of Two Numbers is : "+ Sub +" ");

        Mul = Num1 * Num2;
        System.out.println(" \n Multiplication of Two Numbers is : "+ Mul +" ");

        Div = Num1 / Num2;
        System.out.println(" \n Division of Two Numbers is : "+ Div +" ");

        Mod = Num1 % Num2;
        System.out.println(" \n Modulus of Two Numbers is : "+ Mod +" ");


    }
}