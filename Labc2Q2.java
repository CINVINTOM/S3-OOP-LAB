

public class Queue 
       {
	public static final int DEFAULT_SIZE = 5;
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
        Public static void main(Strings arg[])
