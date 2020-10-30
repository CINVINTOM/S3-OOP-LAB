import java.io.*;
import java.util.Scanner;
class amstrong
{
    public static void main(String arg[])
    {
        int l,am =0 ,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Check given number is AMSTRONG or not");
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        f = n;
        while(f >= 1)
        {
            l = f % 10;//to get last digit
            
            am = am +(l*l*l);//to get sum of cubes of digits
            
            f = f / 10;//to remove last digit
        }
        
        if(am == n){
            System.out.println(n + " = " + am + "\n" + n + " is a AMSTRONG ");
        }
        else{
         System.out.println(n + " != " + am + "\n" + n + " is NOT a AMSTRONG ");
        }

    }
}
