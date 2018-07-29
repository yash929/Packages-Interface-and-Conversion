abstract class AbstractImplementation
{
	public String color;
	public String breed;
	public String name;
	abstract void eat();
	public void speak()
	{
		System.out.println("Speak");
	}
}
class Abstract2 extends AbstractImplementation
{
	public Abstract2(String color, String breed, String name)
	{
		this.color = color;
		this.breed = breed;
		this.name = name;
	}
	 void eat()
	{
		System.out.println("Bone");
	}
	 
}
class Abstract1
{
	public static void main(String args[])
	{
		Abstract2 a1 = new Abstract2("White","Labra Dog","Pete");
		System.out.println("Name of the dog :"+a1.name);
		System.out.println("Dog's color :"+a1.color);
		System.out.println("Dog's breed :"+a1.breed);
		a1.eat();
		a1.speak();
	}	
}		
		