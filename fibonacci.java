import java.io.*;
import java.util.Scanner;
class fibonacci
{
    public static void main(String arg[])
    {
        int f=0,s=1,fib;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print 1st N fibonacci series");
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        
        System.out.println("\n  First " + n + " fibonacci series are :\n" + f);
        n--;// f is printed and number reduced by 1
        
         if(n >= 2)
        {
            System.out.println( s );
            n--;
        }
        
        for(int i = 1 ; i <= n ; ++i)
        {
           fib = f + s;
           System.out.println( fib );
           f=s;
           s = fib ;
            
        }
        
    }
}
