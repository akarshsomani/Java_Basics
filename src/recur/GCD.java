package recur;

class GCD
{
	public static int gcd(int m,int n)
	{
		if(n == 0)
		{
			return m;
		}
		else
		{
			return gcd(n,m%n);
		}
	}


	public static void main(String[] args)
	{
		System.out.println(gcd(9,3));
	}
}
