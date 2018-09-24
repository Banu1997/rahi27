/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class PrimeNo 
{

    public static void main(String[] args) {

        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println( " yes");
        else
            System.out.println( "no");
    }
}
