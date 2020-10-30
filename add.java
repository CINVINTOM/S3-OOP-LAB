import java.io.*;
import java.util.Scanner;
class add
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Program to add two numbers");
        System.out.println("Enter the 1st number:");
        int a = obj.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = obj.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
