/*2.Define a class Queue for representing a queue data 
structure. The class must define a default 
constructor, a parameterized constructor and 
functions for en queue, de-queue and display 
operations. Write a Java program to implement this.*/

import java.util.Scanner;

public class Queue 
       {
	public static final int DEFAULT_SIZE = 4;
	private Object data[];
	private int index;

        //default constructor 
	public Queue() 
        {
		data = new Object[DEFAULT_SIZE];
	}
         
       //Parameterized constructor 
	public Queue(int size) 
        {
		data = new Object[size];
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public void enqueue(Object obj) throws Exception {
		if (index == data.length - 1) 
                {
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[index] = obj;
		this.index++;
	}

	public Object dequeue() throws Exception 
        {
		if (isEmpty())
			throw new Exception("Queue is empty");
		Object obj = this.data[0];
		for (int i = 0; i < this.index - 1; i++) 
                {
			data[i] = data[i + 1];
		}
		this.index--;
		return obj; //to return removed item

	}
        public Object display() throws Exception 
        {
		if (isEmpty())
			throw new Exception("Queue is empty");

		System.out.println("Queue elements are :") ;
		for (int i = 0; i < this.index; i++) 
                {
			System.out.println(data[i]) ;
		}

	}
}

class Labc2Q2
{
        public static void main(Strings arg[])
        {
               Scanner s = new Scanner(System.in);
               int SIZE=4;
               System.out.println("Program to impliment Queue") ;
               System.out.println("Default size of Queue is 4") ;
               public void menu(){
               System.out.println("MENU") ;
               System.out.println("\n 1 for Change size of Queue") ;
               System.out.println("2 for enqueue") ;
               System.out.println("3 for dequeue") ;
               System.out.println("4 for Display Queue elements") ;
               System.out.println(5 for EXIT") ;
               System.out.println("Enter your choice (1/2/3/4/5) : ") ;
               int c = s.nextInt();
               Queue queue = new Queue();
               if(c==1)
               {
                  
                   System.out.println("ENTER THE SIZE  :") ;
                   int SIZE = s.nextInt();
                   Queue queue = new Queue(SIZE);
                   this.menu();
                }
               else if(c==2)
               {
                  
                   System.out.println("ENTER THE element to be inserted  :") ;
                   int e = s.nextInt();
                  
                   queue.enqueue(e);

                   this.menu();
                }
              else if(c==3)
               {
                  
                   
                   
                   System.out.println(queue.dequeue() + "Is removed from queue");
                   this.menu();
                }
               else if(c==4)
               {
                  
                   
                   queue.display());
                   this.menu();
                }
               else if(c==5)
               {
                  
                   System.out.println("FINISHED") ;               
               }
               else
               {
                  
                   System.out.println("Not proper input") ;               
               }
        }        
}
