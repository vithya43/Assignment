
public class Palindrome {
	public static void main(String arg[]) {

        int n=5885, reverse=0,remainder,real;
        real=n;
        while(n!=0)
        {
            remainder=n%10;
            reverse=reverse*10+remainder;
            n/=10;
        }
        if (real==reverse)
            System.out.println(real+"is a palindrome");
        else
            System.out.println(real+"is not a palindrome");
    }

}
