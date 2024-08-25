import java.util.*;
public class Maximum_Two
{
    public static void main(String [] arg)
    {
        int N1 = 0, N2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter First Number : ");
        N1 = sc.nextInt();

        System.out.print("\n Enter Second Number : ");
        N2 = sc.nextInt();

        if (N1 > N2)
        {
            System.out.println(" \n  "+ N1 +" is Maximum number than "+ N2 +"");
        }
        else
        {
            System.out.println(" \n  "+ N2 +" is Maximum number than "+ N1 +"");

        }


    }
}
