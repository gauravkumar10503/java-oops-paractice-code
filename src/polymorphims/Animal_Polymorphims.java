/*Write a Java program to create a base class Animal (Animal Family)
with a method called Sound(). Create two subclasses Bird and Cat.
Override the Sound() method in each subclass to make a specific sound 
for each animal.*/
package polymorphims;

public class Animal_Polymorphims
{
	public static void main(String[]args)
	{
		Bird b=new Bird();
		b.sound();
		
		System.out.println("---------------------------------------------");
		
		Cat c=new Cat();
		c.sound();
	}
}

class Animal
{
	public void sound()
	{
		
	}
}
class Bird extends Animal
{
	public void sound()
	{
		System.out.println("Bird is making sound");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Cat is making sound ");
	}
}
