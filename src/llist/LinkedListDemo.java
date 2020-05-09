package llist;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();

		list.insertathead(5);
		list.insertathead(10);
		list.insertathead(2);
		list.insertathead(12);
		list.insertathead(9);
		list.insertathead(19);
		
		list.deletefromhead();

		System.out.println("LinkedList Content:" + list);
		System.out.println("Length:" + list.length());
		System.out.println("Found:"+ list.find(9));

	}

}



