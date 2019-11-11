package basics;
import java.util.Scanner;

public class Primenum 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while(num>0) 
		{
			int digi = num%10;
			rev = rev*10+digi;
			num = num/10;
		}
			if(temp==rev) 
				System.out.println("The given number is palindrome");
			else
				System.out.println("The given number is not palindrome");
			int i,flag = 0;
			int m = temp/2;
			if(temp==0||temp==1)
			{
				System.out.println(temp+"is not prime number");
	
			}
			else
			{
				for(i=2;i<=m;i++)
				{
					if(temp%i == 0)
					{
						System.out.println(temp+"is not prime number");
						flag = 1;
						break;
					}
				}
				if(flag == 0)
				{
					System.out.println(temp+"P is prime number");
				}
			}
	}
}
	

