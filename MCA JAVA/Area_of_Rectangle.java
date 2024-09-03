import java.util.*;
public class Area_of_Rectangle
{
    public static void main(String arg[])
    {
        float Height = 0, Width = 0;
        float Area = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter height : ");
        Height = sc.nextFloat();

        System.out.print("\n Enter width : ");
        Width = sc.nextFloat();

        Area = Height * Width;

        System.out.println(" \n Area of Rectangle : "+Area+" ");
    }
}