//Class Animal with name, age, weight. Extend Dog with  ownerName.
package inheritance;

public class Animal_Single_Inheritance 
{
	public static void main(String[]args)
	{
		Dog d=new Dog("Leo",2,15.3,"Smith");
		d.info();
	}
}

class Animals
{
	public String name;
	public int age;
	public double weight;
	public Animals(String name,int age,double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	public void animalinfo()
	{
		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age+" years");
		System.out.println("Weight :- "+weight+" kgs");
	}
}

class Dog extends Animals
{
	public String ownername;
	public Dog(String name,int age,double weight,String ownername)
	{
		super(name,age,weight);
		this.ownername=ownername;
	}
	public void info()
	{
		System.out.println("Owner's name :- "+ownername);
		animalinfo();
	}
}
