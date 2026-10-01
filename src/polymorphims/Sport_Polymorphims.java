/*Write a Java program to create a base class Sports with a method called
play(). Create three subclasses: Football, Basketball, and Rugby. Override 
the play() method in each subclass to play a specific statement for each sport.*/
package polymorphims;

public class Sport_Polymorphims
{
	public static void main(String[]args)
	{
		Football f=new Football();
		f.play(); 
		
		System.out.println("-------------------------------------------------");
		
		Rugby r=new Rugby();
		r.play();
		
		System.out.println("----------------------------------------------");
		
		Basketball b=new Basketball();
		b.play();
	}
}

class Sport
{
	public void play()
	{
		System.out.println("Let's play !!!!!");
	}
}

class Football extends Sport
{
	public void play()
	{
		System.out.println("We've 7 players ");
		System.out.println("Let's play football");
	}
}
class Basketball extends Sport
{
	public void play()
	{
		System.out.println("We've 9 players ");
		System.out.println("Let's play basketball");
	}
}
class Rugby extends Sport
{
	public void play()
	{
		System.out.println("We've 12 players ");
		System.out.println("Let's play rugby");
	}
}
