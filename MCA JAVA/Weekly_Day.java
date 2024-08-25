import java.util.*;
public class Weekly_Day
{
    public static void main(String [] arg)
    {
        int Day = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter a number (1-7) to display day of the week : ");
        Day = sc.nextInt();

        if( Day == 1)
        {
            System.out.println(" \n Sunday");
        }

        else if( Day == 2)
        {
            System.out.println(" \n Monday");
        }

        else if( Day == 3)
        {
            System.out.println(" \n Tuesday");
        }

        else if( Day == 4)
        {
            System.out.println(" \n Wednesday");
        }

        else if( Day == 5)
        {
            System.out.println(" \n Thursday");
        }

        else if( Day == 6)
        {
            System.out.println(" \n Friday");
        }

        else if( Day == 7)
        {
            System.out.println(" \n Saturday");
        }

        else 
        {
            System.out.println(" \n Please Enter Valid Day Number");
        }

        
    }
}