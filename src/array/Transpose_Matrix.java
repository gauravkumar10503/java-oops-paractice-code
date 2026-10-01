package array;

public class Transpose_Matrix
{
	public static void main(String[]args)
	{
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Main matrix :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				if(i>=j)
				{
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		
		System.out.println("Transpose of the matrix :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
