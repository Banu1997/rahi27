/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial {

    public static void main(String[] args) {

        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            
            factorial *= i;
        }
        System.out.printf(""+factorial);
    }
}
