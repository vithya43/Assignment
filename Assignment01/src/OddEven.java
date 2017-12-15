import java.util.Scanner;

public class OddEven {
	public static void main(String arg[])
	{
	int x;
    System.out.println("Enter a number");
    Scanner scan=new Scanner(System.in);
    x=scan.nextInt();
    if(x%2==0)
       System.out.println("It is an even number");
    else
       System.out.println("It is an odd number");
}
}