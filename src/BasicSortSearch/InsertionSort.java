package BasicSortSearch;

import java.io.*;
class InsertionSort
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
			int element  = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > element)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+ 1] = element;
		}

		System.out.print("Sorted Order is - ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
}
