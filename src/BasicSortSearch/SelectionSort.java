package BasicSortSearch;

import java.io.*;
class SelectionSort
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
			int pos = i;
			for(int j = i+1; j< n; j++)
			{
				if(a[pos] > a[j])
				{
					pos = j;
				}
			}

			int tmp = a[i];
			a[i] = a[pos];
			a[pos] = tmp;			

		}

		System.out.print("Sorted Order is - ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
}
