package basics;
import java.util.Scanner;

public class IncomeTax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the reservation type:");
		String restype = sc.next();
		System.out.println("Enter the Annual Income:");
		long amt = sc.nextLong();
		long i = amt;
		if(restype == "general") 
		{
			if(i ==0 && i <= 1800000 )
			{
				System.out.println("No tax");
			}
			else if(i == 180001 || i <=500000 )
			{
				System.out.println("Tax is 10%");
			}
			else if(i == 500001 || i <= 800000)
			{
				System.out.println("Tax is 20%");
			}
			else if(i >= 800000)
			{
				System.out.println("Tax is 30%");
			}
		}
		else if(restype == "Women")
		{

			if(i ==0 || i <= 1900000 )
			{
				System.out.println("No tax");
			}
			else if(i == 190001 || i <=500000 )
			{
				System.out.println("Tax is 10%");
			}
			else if(i == 500001 || i <= 800000)
			{
				System.out.println("Tax is 20%");
			}
			else if(i >= 800000)
			{
				System.out.println("Tax is 30%");
			}
		}
	}
}
