package BasicSortSearch;

import java.io.*;
class BubbleSort
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.println("Input the size of an array");
		int n = Integer.parseInt(in.readLine());

		System.out.println("Input space seperated input");
		int a[] = new int[n];
		String s[] = in.readLine().split(" ");
		for(int i =0; i<n; i++)
		{

			a[i] = Integer.parseInt(s[i]);
		}
		

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j< n-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print("Sorted Order is - ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
}
