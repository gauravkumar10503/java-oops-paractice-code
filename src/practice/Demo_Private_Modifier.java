//Demonstrate that a private method cannot be inherited.
package practice;

public class Demo_Private_Modifier 
{
	public static void main(String[]args)
	{
		Demo d=new Demo();
		//d.run();// error not visible by another method or class
		Experiment e=new Experiment();
		e.experiment();
	}
}

class Demo
{
	private void run()
	{
		System.out.println("This is a private method");
	}
}

class Experiment extends Demo
{
	public void experiment()
	{
		System.out.println("This is a experiment method");
		//run(); can't inherited run method
	}
}
