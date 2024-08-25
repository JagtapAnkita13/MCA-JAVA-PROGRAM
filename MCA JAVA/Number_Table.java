import java.util.*;
public class Number_Table
{
    public static void main(String [] arg)
    {
        int Num = 0, i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter Number : ");
        Num = sc.nextInt();

        while (i<=10)
        {
            System.out.println(" \n "+ Num +" * "+ i +" = "+ Num*i +" ");
            i++;
        }
    }
}