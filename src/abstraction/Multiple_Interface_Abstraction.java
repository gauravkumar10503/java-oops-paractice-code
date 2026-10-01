/*7. Multiple Interfaces

Define interfaces Printable and Scannable.
A class PrinterScanner implements both interfaces.
Demonstrate calling both methods.*/
package abstraction;

public class Multiple_Interface_Abstraction 
{
	public static void main(String[]args)
	{
		Pscanner p=new Pscanner();
		p.scan();
		p.print();
	}
}

interface Printable
{
	void print();
}

interface Scannable
{
	void scan();
}

class Pscanner implements Printable,Scannable
{
	public void print()
	{
		System.out.println("Print the file ");
	}
	public void scan()
	{
		System.out.println("Scan the file ");
	}
}
