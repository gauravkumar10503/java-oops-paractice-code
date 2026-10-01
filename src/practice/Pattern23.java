package practice;

public class Pattern23 
{
	public static void main(String[]arga)
	{
		int space=10;
		int star=1;
		int a=11;
		
		for(int i=0;i<=10;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(a+" ");
				a++;
			}
			space--;
			star++;
			System.out.println();
		}
	}
}
