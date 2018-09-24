import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Oddbtw
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N,Q;
		int i=0;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		Q=s.nextInt();
		
		
		
		for(i=N+1; i<Q; i++)
        {
            if(i%2!=0)
                System.out.print(i+" ");
        }   
		
	}
}
