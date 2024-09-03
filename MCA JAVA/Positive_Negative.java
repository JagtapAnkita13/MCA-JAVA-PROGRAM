import java.util.*;
public class Positive_Negative
{
    public static void main(String [] arg)
    {
        int Num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Number : ");
        Num = sc.nextInt();

        if ( Num == 0)
        {
            System.out.println("\n Given Number is Zero ");
        }

        else if ( Num >= 0)
        {
            System.out.println("\n "+Num+" is positive number ");
        }

        else if ( Num <= 0)
        {
            System.out.println("\n"+Num+" is negative number ");
        }

        
    }
}
        