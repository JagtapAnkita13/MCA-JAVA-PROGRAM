import java.util.*;
public class Area_of_Circle
{
    public static void main(String arg[])
    {
        float r = 0;
        double Area = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter radius : ");
        r = sc.nextFloat();

        Area = 3.14 * r * r;

        System.out.println(" \n Area of Circle : "+Area+" ");
    }
}
