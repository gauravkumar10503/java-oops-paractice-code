
package methods;

public class Non_Static_Animal 
{
	public static void main(String[]args)
	{
		Animal a=new Animal();
		a.makesound();
		
		System.out.println("-------------------------------------------------");
		
		Dog d=new Dog("Ronny");
		d.makesound();
		
	}
}

class Animal
{
	public void makesound()
	{
		System.out.println("Animal is making sound ");
	}
}
class Dog extends Animal
{
	public String name;
	public Dog(String name)
	{
		this.name=name;
	}
	public void makesound()
	{
		System.out.println(name+" is making sound");
	}
}