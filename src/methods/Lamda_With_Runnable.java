package methods;

public class Lamda_With_Runnable 
{
	public static void main(String []args)
	{
		Runnable myrun =()->System.out.println("Myrun is running");
		new Thread(myrun).start();
	}
}
