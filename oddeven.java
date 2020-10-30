import java.io.*;
import java.util.Scanner;
class oddeven
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ptogram to find given intiger number is odd or even");
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        
        if(n%2 == 0)
        {
            System.out.println(n  + " is Even number");
        }
        else
        {
            System.out.println(n  + " is Odd number");
        }
    }
}
