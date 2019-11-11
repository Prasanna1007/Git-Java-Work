package basics;
import java.util.Scanner;

public class Eggs 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int eggs;
		int dozens;
		int extras;
		System.out.println("How many eggs do you have?");
		eggs = sc.nextInt();
		int gross = eggs/144;
		int rem=eggs%144;
		dozens = rem/12;
		extras = eggs%12;
		System.out.println("The gross of eggs is " + gross+ "number of eggs dozens of"+dozens+"and extras are"+extras);

	}
}
