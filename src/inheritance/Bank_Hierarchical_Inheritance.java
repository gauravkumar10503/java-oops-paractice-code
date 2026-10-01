//Hierarchical: Bank → HDFC, SBI with branchName, interestRate, location.
package inheritance;

public class Bank_Hierarchical_Inheritance 
{
	public static void main(String[]args)
	{
		Hdfc h=new Hdfc("Aurangbad",15.3,"Ramesh chowk");
		h.hbank();
		
		System.out.println();
		
		Sbi s=new Sbi("Gaya",12.5,"New godown");
		s.sbank();
	}
}

class Bank
{
	public String bname;
	public double irate;
	public String loc;
	public Bank(String bname,double irate,String loc)
	{
		this.bname=bname;
		this.irate=irate;
		this.loc=loc;
	}
	public void info()
	{
		System.out.println("Branch name :- "+bname);
		System.out.println("Interest rate :- "+irate+" %");
		System.out.println("Location :- "+loc);
	}
}

class Hdfc extends Bank
{
	public Hdfc(String bname,double irate,String loc)
	{
		super(bname,irate,loc);
	}
	public void hbank()
	{
		System.out.println("-------------WELCOME TO HDFC BANK----------------");
		info();
	}
}
class Sbi extends Bank
{
	public Sbi(String bname,double irate,String loc)
	{
		super(bname,irate,loc);
	}
	public void sbank()
	{
		System.out.println("-------------WELCOME TO SBI BANK----------------");
		info();
	}
}