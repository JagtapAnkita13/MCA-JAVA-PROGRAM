import java.util.*;
public class Stud_Info
{
    public static void main(String arg[])
    {
        String Name, Course, City;
        int Roll_No = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Student Name : ");
        Name = sc.nextLine();

        System.out.print("\n Enter Roll Number : ");
        Roll_No = sc.nextInt();

        System.out.print("\n Enter Course : ");
        Course = System.console().readLine();

        System.out.print("\n Enter City : ");
        City = System.console().readLine();

        System.out.print(" \n Student Name : "+Name+", \n  Roll Number : "+Roll_No+", \n Course : "+Course+", \n City : "+City+" ");


    }
}