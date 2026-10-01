//Class Employee with name, id, salary. Extend Manager with department, bonus.
package inheritance;

public class Emp_Inheritanace 
{
	public static void main(String[]args)
	{
		Manager m=new Manager("Anku","A7296",59000,"Java",10000);
		m.managerinfo();
		m.totalsal();
		
		System.out.println("----------------------------------------------");
		
		Emp e=new Emp("Tarkeshwar","T9939",59000);
		//e.totalsal();	give us error
		e.empinfo();
		
		
	}
}

class Emp
{
	public String name;
	public String id;
	public int sal;
	public Emp(String name,String id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	protected void empinfo()
	{
		System.out.println("Employee's name :- "+name);
		System.out.println("Employee's id :- "+id);
		System.out.println("Employee's salary :- "+sal);
	}
}

class Manager extends Emp
{
	public String dept;
	public int bonus;
	public Manager(String name,String id,int sal,String dept,int bonus)
	{
		super(name,id,sal);
		this.dept=dept;
		this.bonus=bonus;
	}
	public void managerinfo()
	{
		super.empinfo();
		System.out.println("Department :- "+dept);
		System.out.println("Bonus :- "+bonus);
	}
	public void totalsal()
	{
			int t=bonus+sal;
			System.out.println("After adding bonus,Total salary is :- "+t);
	}
}
