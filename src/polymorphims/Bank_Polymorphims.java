 /*Write a Java program to create a base class BankAccount with methods 
 deposit() and withdraw(). Create two subclasses SavingsAccount and 
 CheckingAccount. Override the withdraw() method in each subclass to 
 impose different withdrawal limits and fees.*/
package polymorphims;

public class Bank_Polymorphims
{
	public static void main(String[]args)
	{
		Savingacc s=new Savingacc();
		s.deposit(40000);
		s.withdraw(2000000);
	}
}

class Bank
{
	public void deposit(int d)
	{
		System.out.println("You've deposit "+d+" rupees in your account ");
	}
	public void withdraw(int w)
	{
		if(w>100000)
		{
			System.out.println("Withdraw failed ❌❌");
			System.out.println("You can't withdraw");
		}
		else
		{
			System.out.println("Withdraw successful !!!!");
			System.out.println("You withdraw "+w+" rupees from your account number ");
		}
	}
}

class Savingacc extends Bank
{
	public void withdraw(int w)
	{
		if(w>500000)
		{
			System.out.println("Withdraw failed ❌❌");
			System.out.println("You can't withdraw");
		}
		else
		{
			System.out.println("Withdraw successful !!!!");
			System.out.println("You withdraw "+w+" rupees from your account number ");
		}
	}
}

class Checkingacc extends Bank
{
	public void withdraw(int w)
	{
		if(w>1000000)
		{
			System.out.println("Withdraw failed ❌❌");
			System.out.println("You can't withdraw");
		}
		else
		{
			System.out.println("Withdraw successful !!!!");
			System.out.println("You withdraw "+w+" rupees from your account number ");
		}
	}
}

