package array_with_function;

import java.util.*;
public class Two_Sum 
{
	public static void Twosum(int []x)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your target value :- ");
		int t=sc.nextInt();
		
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=i+1;j<=x.length-1;j++)
			{
				if(x[i]+x[j]==t)
				{
					System.out.print("Two number "+x[i]+" and "+x[j]+" is "+t);
				}
			}
		}
		sc.close();
	}
	
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :-");
		int s=sc.nextInt();
		
		int []a=new int[s];
		System.out.print("Enter the element of array one by one :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Twosum(a);
		sc.close();
	}
}
