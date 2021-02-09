import java.io.*;
import java.util.Scanner;

class division
	{
	  public static void main(String arg[])
	  {
	  	Scanner obj = new Scanner(System.in);
	 	float dev;
		System.out.println("Program to devide two numbers");

		System.out.println("Enter numbers for a/b : ");

		System.out.println("a : ");
		int a = obj.nextInt();

		System.out.println("b : ");
		int b = obj.nextInt();

	  	try{
	     		dev = a/b;
			System.out.println("result =" + dev);
		
		   }catch (Exception e){
			System.out.println("Somthing went wrong.\nPlease check your inputs");
			}
	}
}
