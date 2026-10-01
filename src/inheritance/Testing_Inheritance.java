package inheritance;

public class Testing_Inheritance 
{
	public static void main(String[]args)
	{
		
		Dogs a=new Dogs();
		a.dog();
		
	}
}

class Animal
{
	public static void dog()
	{
		System.out.println("Dog is breking");
	}
}
class Dogs extends Animal
{
	public static void dog()
	{
		System.out.println("Dog is not breking");
		System.out.println("Your dog is very intelligent");
	}
}

