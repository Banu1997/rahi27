import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class sort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n, temp,middle;
		Scanner sc=new Scanner(System.in);
	    n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;        
        Scanner s = new Scanner(System.in);

                }
            }
        }
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        
	}
}
	
