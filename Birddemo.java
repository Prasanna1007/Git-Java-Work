package oop;

public class Birddemo 
{
	public static void main(String[] args) 
	{
		//create object for class Bird
		Bird p = new Bird();
		
		//set values to attributes
		p.birdColor = "Blue";
		p.birdName = "Peacock";
		/*p.legs = 2;
		p.wings = 2;*/
		
		//call walk method
		p.walk();
		p.setsingStatus();
		p.sing();
		
		//call fly method
		p.fly();
		
		Bird k = new Bird();
		k.birdColor = "Black";
		k.birdName  = "KOKILA";
		k.walk();
		k.setsingStatus();
		k.sing();
		k.fly();
		
		//implicitly inheritance happens
		System.out.println("Object id :"+p.hashCode());

	}
}
