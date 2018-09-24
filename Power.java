/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Power {

    public static void main(String[] args) {

        int  n,e;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        e=s.nextInt();

        long result = 1;

        while (e!= 0)
        {
            result *= n;
            --e;
        }

        System.out.println("" + result);
    }
}
