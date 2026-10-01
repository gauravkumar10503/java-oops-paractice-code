package array_with_function;

import java.util.*;
public class Product_Of_Positive_Element 
{
	static int p=1;
	public static void positive(int []x)
	{
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]>0)
			{
				p*=x[i];
			}
		}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :- ");
		int s=sc.nextInt();
		
		int []a=new int[s];
		System.out.print("Enter the element of the array one by one :-");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		positive(a);
		System.out.println("Product of positive element is :- "+p);
		sc.close();
	}
}
