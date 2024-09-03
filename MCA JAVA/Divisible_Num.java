import java.util.*;
public class Divisible_Num
{
    public static void main(String [] arg)
    {
        int Num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter Number : ");
        Num = sc.nextInt();

        if (Num%7 == 0)
        {
            System.out.println(" \n "+ Num +" is divisible by 7");
        }
        else
        {
            System.out.println(" \n "+ Num +" is not divisible by 7");
        }
    }
}