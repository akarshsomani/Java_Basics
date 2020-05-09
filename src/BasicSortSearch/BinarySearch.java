package BasicSortSearch;

import java.io.*;
class BinarySearch
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);

        System.out.println("Input the size of an array");
        int n = Integer.parseInt(in.readLine());

        System.out.println("Input space seperated sorted input");
        int a[] = new int[n];
        String s[] = in.readLine().split(" ");

        for(int i =0; i<n; i++)
        {

            a[i] = Integer.parseInt(s[i]);
        }

        System.out.println("Input a number to search");
        int element = Integer.parseInt(in.readLine());

        int l = 0;
        int h = n-1;
        int flag = 0;
        while(l<h)
        {
            int m = (l+h)/2;

            if(element< a[m]){
                h = m;
            }
            else if (element > a[m]){
                l=m+1;
            }
            else{
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found");
        }

    }
}