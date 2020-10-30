import java.io.*;
import java.util.Scanner;
class sum
{
    public static void main(String arg[])
    {
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find sum of first N natural numbers");
        System.out.println("Enter the value of N :");
        int n = sc.nextInt();
        
        System.out.println(" sum of first " + n + " natural numbers (without Zero) :");
        
        for(int i = 1 ; i <= n ; i++)
        {
            if(i != n)
            {
                System.out.print( i + " + ");
                s = s + i;
            }
            else
                System.out.print( i + " = " + (s+i));
            
        }
      
        System.out.println("\n\n sum of first " + n + " natural numbers(with Zero) = " + s);
    }
}
