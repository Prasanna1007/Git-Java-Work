package javaFundamentals;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int i,j;
		for(i=0;i<5;i++) 
		{
			for(j=0;j<=i;j++) 
			{
				System.out.print("* ");//prints * in same line
			}
			System.out.println();//prints in next line
		}

	}

}
