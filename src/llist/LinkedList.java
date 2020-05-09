package llist;

public class LinkedList
{
	private Node head;
	
	public void insertathead(int data)
	{
		Node newNode = new Node(data);
		newNode.setnextnode(this.head);
		this.head = newNode;
	}


	public int length()
	{
		Node current = this.head;

		int l = 0;
		while(current != null)
		{
			l++;
			current = current.getnextnode();
		}

		return l;

	}

	public void deletefromhead()
	{
		this.head = this.head.getnextnode();
	}
	

	public Node find(int data)
	{
		Node current = this.head;
		while(current != null)
		{
			if(current.getdata() == data)
			{
				return current;
			}
		}
		return null;
	}


	@Override
	public String toString()
	{
		String result = "{";
		
		Node current = this.head;
		while(current != null)
		{
			result += current.toString()+ ",";
			current = current.getnextnode();
		}
		result += "}";

		return result;
	}

}



