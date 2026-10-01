/*Write-only Field

Problem: Create a Password class. Store a password as private but allow only a setter (no getter).
Next Steps:

Create a private field password.

Add only a setter.*/
package encapsulation;

public class Password_Encapsulation 
{
	public static void main(String[]args)
	{
		Password p=new Password("Gaurav","799233");
		p.setpass("947908@");

		System.out.println("New password :- "+p.getpass());
		//System.out.println("New password :- "+p.setpass("947908"));
	}
}

class Password
{
	private String username;
	private String password;
	public Password(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	public String getpass()
	{
		return password;
	}
	public void setpass(String newpass)
	{
		password=newpass;
	}
}
