package oop;

public class Bird {
//creating instance variables
	public static int legs;	 	//legs and wings are same and declared as Static
	public static int wings;
	public String birdName;
	public String birdColor;
	private boolean singStatus;
//constructor is a method used to initialize common values to the attributes or properties
	Bird()
	{
		legs = 2;
		wings = 2;
	}
//setter method to set value for private variable
	public void setsingStatus()
	{
		if(this.birdName.equalsIgnoreCase("Kokila")) //equals
		{
			singStatus = true;
		}
	}
	
//methods declaration 
	public void walk() 
	{
		System.out.println(birdColor+ " "+birdName +"is walking with"+legs + "legs.");
		
	}
	public void fly()
	{
		System.out.println(birdColor+ " "+birdName +"is flying with"+wings + "wings.");
	}
	public void sing()
	{
		if(singStatus)
		{
			System.out.println("la..laaaa.laaaaa");
		}
		else
		{
			System.out.println("Bird cant sing :(");
		}
		
	}
}
