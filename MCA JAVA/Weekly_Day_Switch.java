import java.util.*;
public class Weekly_Day_Switch
{
    public static void main(String [] arg)
    {
        int daynum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" \n Enter a number (1-7) to display day of the week : ");
        daynum = sc.nextInt();

        switch (daynum)
        {
            case 1:
             System.out.println(" \n Sunday");
             break;
            
            case 2:
            System.out.println(" \n Monday");
            break;
             
            case 3:
            System.out.println(" \n Tuesday");
            break; 

            case 4:
            System.out.println(" \n Wednesday");
            break;
             
            case 5:
            System.out.println(" \n Thursday"); 
            break;  
               
            case 6:
            System.out.println(" \n Friday");  
            break;
             
            case 7:
            System.out.println(" \n Saturday");
            break;
           
            default: 
            System.out.println("\n Invalid input! Please enter a number between 1 and 7");
            break;
             
        
        }
    }
}