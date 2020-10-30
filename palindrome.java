import java.io.*;
import java.util.Scanner;
class palindrome
{
    public static void main(String arg[])
    {
        int l,p =0 ,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Check given number is PALINDROME or not");
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        f = n;
        while(f >= 1)
        {
           l = f % 10;//to get last digit
            
            p = (p*10) + l;//to get reversed number
            
            f = f / 10;//to remove last digit
        }
        
        if(p == n){
            System.out.println(n + " = " + p + "\n" + n + " is a PALINDROME ");
        }
        else{
         System.out.println(n + " != " + p + "\n" + n + " is NOT a PALINDROME ");
        }

    }
}
