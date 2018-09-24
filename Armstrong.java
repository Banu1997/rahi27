/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Armstrong {

    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;
        Scanner s=new Scanner(System.in);
        number=s.nextInt();
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
