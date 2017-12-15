import java.util.Scanner;

public class PrimeOrNot {
public static void main(String arg[])
    {
       int n,i,count=0;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a Number");
       n=scan.nextInt();
		for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
          System.out.println("It is a Prime Number");
        }
        else
        {
          System.out.println("It is not a Prime Number");
}
    }
}

