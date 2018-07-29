interface ImplementMe
{   //final int n = 1,m = 2;
	public void speak();
	public void eat();
}
class Dog implements ImplementMe 
{
	public void speak()
	{
		System.out.println("Bruno says Woof Woof");
	}
	public void eat()
	{
		System.out.println("Bruno likes Chicken");
	}
}
class Cat implements ImplementMe 
{
	public void speak()
	{
		System.out.println("Amelia says Meow Meow");
	}
	public void eat()
	{
		System.out.println("Amelia likes salmon");
	}
}
class Blueprint
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		Cat c = new Cat();
		System.out.println(n);
        d.speak();
		//System.out.println();
		d.eat();
		System.out.println();
		//System.out.println(m);
		c.speak();
		System.out.println();
		c.eat();
	}
}