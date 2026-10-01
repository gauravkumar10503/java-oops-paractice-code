//Demonstrate access modifiers on methods in a single package.

package practice;

public class All_Access_Modifier 
{
	public static void main(String[]args)
	{
		Demo3 d=new Demo3();
		d.walk();
		d.run();
		//d.read();   not visible to main method
		d.sleep();
	}
}

class Demo3
{
	public void walk()
	{
		System.out.println("Aman is walking");
	}
	protected void run()
	{
		System.out.println("Aman is running");
	}
	private void read()
	{
		System.out.println("Aman is reading");
	}
	void sleep()
	{
		System.out.println("Aman is sleeping");
	}
}