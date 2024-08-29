import java.util.*;
public class Multiply_Two_Num
{
    public static void main(String arg[])
    {
        int N1 = 0, N2 = 0, Mul = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Number 1 : ");
        N1 = sc.nextInt();

        System.out.print("\n Number 2 : ");
        N2 = sc.nextInt();

        Mul = N1 * N2;

        System.out.print("\n The result of multiplying "+N1+" and "+N2+" is : "+Mul+" ");

    }
}
