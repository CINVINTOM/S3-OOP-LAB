import java.io.*;
import java.util.Scanner;
class factorial
{
    public static void main(String arg[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find Factorial of First N number");
        System.out.println("Enter value of N:");
        int n = sc.nextInt();
        
        for(int i = 1 ; i <= n ; ++i)
        {
            int j=1, fact=1;
            while(j <= i)
            {
                fact = fact * j;
                j++;
            }
            System.out.println(" Factorial of " + i + "! is : "+fact);
            
        }
    }
}
