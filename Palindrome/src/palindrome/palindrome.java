package palindrome;
import java.util.Scanner;

public class palindrome
{
	public static void main(String[]args)
	{
		int num, mod, rev = 0;
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Enter number to check whether palindrome");
			num = input.nextInt();//read input
			int pal = num;//give pal value ofnum so as to compare later
			while(num>0)
			{
				mod = num % 10;//compute modulus of num and assign to mod variable
				num = num / 10;//divide num by 10 to create a new num value
				rev = rev * 10 + mod;//reversed number
			}
			if(pal == rev)
			{
				System.out.println(pal + " is a palindrome");
			}
			else
			{
				System.out.println(pal + " is not palindrome");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
