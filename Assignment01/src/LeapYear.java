import java.util.Scanner;

public class LeapYear {
	public static void main(String arg[])
	{
	int year;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a year");
	year=scan.nextInt();
	if(year%100==0)
	{
	if(year%400==0)
		System.out.println("It is a Leap Year");
	else
		System.out.println("Not a Leap Year");
	}
	else
	{
	if(year%4==0)
		System.out.println("It is a Leap Year");
	else
		System.out.println("Not a Leap Year");
	}

}
}