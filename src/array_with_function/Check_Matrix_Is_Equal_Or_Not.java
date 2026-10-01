package array_with_function;


public class Check_Matrix_Is_Equal_Or_Not 
{
	public static void equal(int [][]x, int [][]y)
	{
		boolean flag=true;
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=0;j<=x[i].length-1;j++)
			{
				if(x[i][j]!=y[i][j])
				{
					flag=false;
				}
			}
		}
		if(flag==true)
		{
			System.out.print("Given Array is equal");
		}
		else
		{
			System.out.print("Given array is not equal");
		}
	}
	public static void main(String []args)
	{
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]b= {{1,2,3},{4,5,6},{7,8,9}};
		equal(a,b);
	}
}
