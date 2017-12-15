import java.util.Scanner;

public class Vowel {
	public static void main(String arg[])
{
	char st;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character");
    st=s.next().charAt(0);		
	switch(st)
{
	case 'a':
	System.out.println("Vowel");
	break;
	case 'e':
	System.out.println("Vowel");
	break;
	case 'i':
	System.out.println("Vowel");
	break;
	case 'o':
	System.out.println("Vowel");
	break;
	case 'u':
	System.out.println("Vowel");
    break;
	default:
	System.out.println("Consonant");	
}
}
}
