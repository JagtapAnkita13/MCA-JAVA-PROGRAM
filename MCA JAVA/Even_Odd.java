import java.util.*;
public class Even_Odd
{
    public static void main(String [] arg)
    {
        int Num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter Number : ");
        Num = sc.nextInt();

        if (Num%2 == 0)
        {
            System.out.println(" \n "+ Num +" is even number");
        }
        else
        {
            System.out.println(" \n "+ Num +" is odd number");
        }
    }
}