import java.util.*;
public class Prime_Number
{
    public static void main(String [] arg)
    {
        int Num = 0, i = 0, Count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter Number : ");
        Num = sc.nextInt();

        for ( i = 2; i < Num; i++)
        {
            if ( Num % i == 0 )
            {
                Count++;
                break;
            }
        }

        if ( Count == 0 )
        {
            System.out.println(" \n "+ Num +" is Prime Number");
        }

        else
        {
            System.out.println(" \n "+ Num +" is Not Prime Number"); 
        }
    }
}