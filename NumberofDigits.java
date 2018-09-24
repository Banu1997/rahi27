/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class NumberofDigits {

    public static void main(String[] args) {

        int count = 0, num;
        Scanner s=new Scanner(System.in);
        
        num=s.nextInt();

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("" + count);
    }
}
