package recur;

class Towerofhanoi
{
	public static void move(int n, char from, char to, char inter)
	{
		if(n==1)
		{
			System.out.println("Move Disk "+n+" from "+from +" to "+ to);
			return;
		}
		move(n-1, from, inter, to);
		System.out.println("Move Disk "+n+" from "+from +" to "+ to);
		move(n-1, inter, to, from);
	}


	public static void main(String args[])
	{
		move(3, 'A', 'C', 'B');
	}
}
