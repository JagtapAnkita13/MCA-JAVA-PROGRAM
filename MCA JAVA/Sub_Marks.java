import java.util.*;
public class Sub_Marks
{
    public static void main(String arg[])
    {
        int Sub1 = 0, Sub2 = 0, Sub3 = 0, Total = 0;
        float Per = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Marks in Subject 1 : ");
        Sub1 = sc.nextInt();

        System.out.print("\n Marks in Subject 2 : ");
        Sub2 = sc.nextInt();

        System.out.print("\n Marks in Subject 3 : ");
        Sub3 = sc.nextInt();

        Total = Sub1 + Sub2 + Sub3;

        Per = Total / 3;

        System.out.println("\n Total Marks : "+Total+", Percentage : "+Per+" ");
        
        
    }
}