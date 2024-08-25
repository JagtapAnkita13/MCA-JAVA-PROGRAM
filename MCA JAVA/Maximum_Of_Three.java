import java.util.*;
public class Maximum_Of_Three
{
    public static void main(String [] arg)
    {
        int N1 = 0, N2 = 0, N3 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter First Number : ");
        N1 = sc.nextInt();

        System.out.print("\n Enter Second Number : ");
        N2 = sc.nextInt();

        System.out.print("\n Enter Third Number : ");
        N3 = sc.nextInt();

        if (N1==N2 && N2==N3)
        {
          System.out.println(" \n This numbers are equal");
        }
        
        else if(N1>N2 && N1>N3)
        {
          System.out.println(" \n "+ N1 +" is maximum number");
        }

        else if(N2>N1 && N2>N3)
        {
          System.out.println(" \n "+ N2 +" is maximum number");
        }
        
        else if(N3>N1 && N3>N2)
        {
          System.out.println(" \n "+ N3 +" is maximum number");
        }
    }
}