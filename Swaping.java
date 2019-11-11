package basics;
import java.util.Scanner;
public class Swaping 
{
	public static void main(String[] args) 
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value");
		x = sc.nextInt();
		System.out.println("Enter y value");
		y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Swapped values" +x +" " +y);
	}
}
