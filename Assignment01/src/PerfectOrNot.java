import java.util.Scanner;


public class PerfectOrNot {
	public static void main(String arg[])
	{
		int number,i,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		number=scan.nextInt();
		for(i=1;i<number;i++)
			{
			if(number%i==0)
			
			{
				sum=sum+i;
	}}
	if(sum==number)
	{
		System.out.println("It is a perfect number");
	}
	else
	{
		System.out.println("Not a perfect number");
	}
}
}
