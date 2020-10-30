import java.io.*;
import java.util.Scanner;
class factor
{
    public static void main(String arg[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find Factors of a given positive number");
        System.out.println("Enter the positive number:");
        int n = sc.nextInt();
        
        System.out.print(" Factors of " + n + " are : ");
        
        for(int i = 1 ; i <= n ; ++i)
        {
            if(n % i == 0)
            {
                System.out.print( i + ", ");
            }
            
        }
        System.out.println("\n");
    }
}
