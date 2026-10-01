/*Class Employee with name, salary, department. Extend Manager
with teamSize, managerLevel.*/
package inheritance;

public class Emps_Singlelevel_inheritance 
{
	public static void main(String[]args)
	{
		Memp m=new Memp("Anku",59000,"JAVA",7,2);
		m.managerinfo();
	}
}

class Employee
{
	public String name;
	public int sal;
	public String dept;
	public Employee(String name,int sal,String dept)
	{
		this.name=name;
		this.sal=sal;
		this.dept=dept;
	}
	public void empinfo()
	{
		System.out.println("Name :- "+name);
		System.out.println("Salary :- "+sal);
		System.out.println("Department :- "+dept);
	}
}

class Memp extends Employee
{
	public int teamsize;
	public int managerlevel;
	public Memp(String name,int sal,String dept,int teamsize,int managerlevel)
	{
		super(name,sal,dept);
		this.teamsize=teamsize;
		this.managerlevel=managerlevel;
	}
	public void managerinfo()
	{
		empinfo();
		System.out.println("No of member :- "+teamsize);
		System.out.println("Manager level :- "+managerlevel);
	}
}