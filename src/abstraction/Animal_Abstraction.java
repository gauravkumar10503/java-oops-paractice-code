/*3. Abstract Method Overriding

Define an abstract class Animal with an abstract method sound().
Implement it in subclasses Dog, Cat
Call sound() for each.*/
package abstraction;

public class Animal_Abstraction
{
	public static void main(String[]args)
	{
		Dog d=new Dog();
		d.sound();
		
		System.out.println("-----------------------------------------------");
		
		Cat c=new Cat();
		c.sound();
	}
}

abstract class Animal
{
	abstract void sound();
}

class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog is braking ");
	}
}

class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Cat is meawing");
	}
}