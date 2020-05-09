package StackQueue;

public class Queue
{
	int arr[];
	int tail;
	int head;

	public Queue()
	{
		tail = -1;
		head = -1;
		arr = new int[1000];
	}


	public void push(int data)
	{
		arr[++head] = data;
	}


	public int pop()
	{
		return arr[++tail];
	}


	public int length()
	{
		return head - tail;
	}


	public static void main(String args[])
	{
		Queue q = new Queue();
		q.push(5);
		q.push(0);
		q.push(3);
		q.push(4);
		System.out.println(q);
		System.out.println("Length:"+ q.length());
		q.pop();
		System.out.println(q);
                System.out.println("Length:"+ q.length());
		q.pop();
		q.push(10);
		System.out.println(q);
                System.out.println("Length:"+ q.length());


	}

	@Override
	public String toString()
	{
		String a = "{";
		for(int i = tail + 1; i <= head; i++)
		{
			a += arr[i] + ",";
		}
		a += "}";
		return a;
	}
}
