import java.util.*;
public class Add_Two_Num
{
    public static void main(String arg[])
    {
        int N1 = 0, N2 = 0, Sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Number 1 : ");
        N1 = sc.nextInt();

        System.out.print("\n Number 2 : ");
        N2 = sc.nextInt();

        Sum = N1 + N2;

        System.out.print("\n The result of adding "+N1+" and "+N2+" is : "+Sum+" ");


    }
}