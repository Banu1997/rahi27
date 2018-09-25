import java.util.Scanner;

class SumofAP {
public static void main(String[] arg)
    {int n,a,d;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    a=sc.nextInt();
    d=sc.nextInt();
    System.out.print(" "+n*(2*a+(n-1)*d)/2);
    }
}
