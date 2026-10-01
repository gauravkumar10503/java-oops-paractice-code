package array_with_function;

import java.util.*;
public class Segregate0_And1 
{
	public static void segregate(int []x)
	{
		int noz=0;
		@SuppressWarnings("unused")
		int noo=0;
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]==0)
			{
				noz++;
			}
			else if(x[i]==1)
			{
				noo++;
			}
		}
		for(int j=0;j<=noz-1;j++)
		{
			x[j]=0;
		}
		for(int k=noz;k<=x.length-1;k++)
		{
			x[k]=1;
		}
		System.out.print("Segregate Array :- "+Arrays.toString(x));
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :- ");
		int s=sc.nextInt();
		
		int []a=new int[s];
		System.out.print("Enter the element of the array one by one :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		segregate(a);
		sc.close();
	}
}
