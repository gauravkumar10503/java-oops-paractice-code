package practice;

public class Pattern22
{
	public static void main(String[]args)
	{
		int star =1;
		int space =10;		
		for(int i=0;i<=10;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			star++;
			space--;
			System.out.println();
			
		}
		
	}
}
