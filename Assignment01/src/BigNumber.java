import java.util.Scanner;
public class BigNumber {
public static void main(String arg[])
{
	int a,b,c;
	System.out.println("Largest of three numbers");
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the A value:");
	a=s.nextInt();
	System.out.println("Enter the B value:");
	b=s.nextInt();
	System.out.println("Enter the C value:");
	c=s.nextInt();
	if(a>b)
		if(a>c)
		{
			System.out.println("a is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
	else if(b>c)
	{
		System.out.println("b is largest");
	}
	else
	{
		System.out.println("c is largest");
	}
}
}
