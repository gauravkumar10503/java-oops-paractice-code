/*11. Interface Inheritance

Make interface A with method methodA(), and interface B 
extends A adding methodB().
Implement both in a class MyClass.*/
package abstraction;

public class Interface_Inheritance_Abstraction 
{
	public static void main(String[]args)
	{
		Myclass m=new Myclass();
		m.A();
		m.B();
	}
}

interface A
{
	void A();
}

interface B extends A
{
	void A();
	void B();
}

class Myclass implements A,B
{
	public void A()
	{
		System.out.println("Interface of A method a");
	}
	public void B()
	{
		System.out.println("Interface of B method b");
	}
}