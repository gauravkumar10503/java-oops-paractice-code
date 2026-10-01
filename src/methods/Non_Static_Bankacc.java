package methods;

public class Non_Static_Bankacc 
{
	public static void main(String[]args)
	{
		Bankacc b=new Bankacc();
		b.deposit(100000);
		b.withdraw(20000);
	}
}

class Bankacc
{
	public void deposit(double a)
	{
		System.out.println("You've deposit "+a+" into your account");
	}
	public void withdraw(double w)
	{
		System.out.println("You've withdraw "+w+" from your account");
	}
}
