/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N,K;
		int sum=0;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		K=s.nextInt();
		int a[]=new int[N];
		
		
		for(int i=0;i<=N-1;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		for(int i=0;i<K;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(""+sum);
	}
}
