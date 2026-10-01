package methods;
import java.util.Scanner;
public class Non_Static_Person 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name :- ");
		String n=sc.next();
		System.out.print("Enter your age :- ");
		int a=sc.nextInt();
		Person p=new Person();
		p.showinfo(n, a);
		sc.close();
	}
}

class Person
{
	public String name;
	public int age;
	public void showinfo(String name,int age)
	{
		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age);
	}
}