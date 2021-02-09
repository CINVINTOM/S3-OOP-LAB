import java.io.*;
import java.util.Scanner;

class prime
{
    public static void main(String arg[])
    {
        int p=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Program to check given number is PRIME or not");
        System.out.println("Enter the number :");
        int n = obj.nextInt();
        
        for(int i = 2 ; i < (n/2) ; i++)
            if(n%i == 0)
                p++;
        
        if(p == 0)
            System.out.println( "  " + n +" is  a PRIME number");
        else
            System.out.println( "  " + n +" is NOT a PRIME number");
    }
}
