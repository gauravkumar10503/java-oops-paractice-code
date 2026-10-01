//Class Animal with name, species, age. Extend Cat with furColor, isIndoor.
package inheritance;

public class Animal_Cat_Singlelevel
{
	public static void main(String[]args)
	{
		Cat c=new Cat("Cutie","Persian",1,"White",false);
		c.cinfo();
	}
}

class AnimalS
{
	public String name;
	public String species;
	public int age;
	public AnimalS(String name,String species,int age)
	{
		this.name=name;
		this.species=species;
		this.age=age;
	}
	public void ainfo()
	{
		System.out.println("Name :- "+name);
		System.out.println("Specie :- "+species);
		System.out.println("Age :- "+age+" year");
	}
}

class Cat extends AnimalS
{
	public String furcolor;
	public boolean isindoor;
	public Cat(String name,String species,int age,String furcolor,boolean isindoor)
	{
		super(name,species,age);
		this.furcolor=furcolor;
		this.isindoor=isindoor;
	}
	public void cinfo()
	{
		ainfo();
		System.out.println("Color :- "+furcolor);
		System.out.println("Is indoor :- "+isindoor);
	}
}