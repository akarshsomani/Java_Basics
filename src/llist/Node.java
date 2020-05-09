package llist;

public class Node
{
	private int data;
	private Node node;

	public Node(int data)
	{
		this.data = data;
	}

	public int getdata()
	{
		return this.data;
	}

	public Node getnextnode()
	{
		return this.node;
	}

	public void setdata(int data)
	{
		this.data = data;
	}

	public void setnextnode(Node node)
	{
		this.node = node;
	}

	@Override
	public String toString()
	{
		return "Data:"+ this.data;
	}
}



