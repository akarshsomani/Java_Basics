package StackQueue;

public class Stack
{
	int arr[];
	int top;

	public Stack()
	{
		top = -1;
		arr = new int[1000];
	}


	public void push(int data)
	{
		arr[++top] = data;
	}


	public int pop()
	{
		return arr[top--];
	}


	public int length()
	{
		return top+1;
	}


	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(5);
		s.push(0);
		s.push(3);
		s.push(4);
		System.out.println(s);
		System.out.println("Length:"+ s.length());
		s.pop();
		System.out.println(s);
                System.out.println("Length:"+ s.length());
		s.pop();
		s.push(10);
		System.out.println(s);
                System.out.println("Length:"+ s.length());


	}

	@Override
	public String toString()
	{
		String a = "{";
		for(int i = 0; i <= top; i++)
		{
			a += arr[i] + ",";
		}
		a += "}";
		return a;
	}
}
