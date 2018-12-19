/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


/* Name of the class has to be "Main" only if the class is public. */

	 class time

{

    public static void main(String[] args)

    { int m;
    Scanner sc=new Scanner(System.in);
    m=sc.nextInt();

        int runtime = m; // number of total runtime minutes

 

        int hours = runtime / 60;

 

        int minutes = runtime % 60; // 5 in this case.

 

        System.out.println(" " + hours + "  " + minutes + "");

    }
}

