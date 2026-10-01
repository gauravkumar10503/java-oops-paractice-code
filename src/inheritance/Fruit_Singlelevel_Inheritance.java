//Class Fruit with name, color, weight. Extend Mango with variety, season.
package inheritance;

public class Fruit_Singlelevel_Inheritance 
{
	public static void main(String[]args)
	{
		Mango m=new Mango("Biju mango"," green",150,"Biju","Summer");
		m.minfo();
	}
}

class Fruit
{
	public String name;
	public String color;
	public double weight;
	public Fruit(String name,String color,double weight)
	{
		this.name=name;
		this.color=color;
		this.weight=weight;
	}
	public void finfo()
	{
		System.out.println("Name :- "+name);
		System.out.println("Color :- "+color);
		System.out.println("Weight :- "+weight+" g");
	}
}

class Mango extends Fruit
{
	public String variety;
	public String season;
	public Mango(String name,String color,double weight,String variety,String season)
	{
		super(name,color,weight);
		this.variety=variety;
		this.season=season;
	}
	public void minfo()
	{
		finfo();
		System.out.println("Variety :- "+variety);
		System.out.println("Season :- "+season);
	}
}
