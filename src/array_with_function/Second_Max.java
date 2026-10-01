package array_with_function;

import java.util.*;
public class Second_Max 
{
	public static void Secondmax(int []x)
	{
		int fmax=x[0];
		int smax=-1;
		
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]>fmax)
			{
				smax=fmax;
				fmax=x[i];
			}
			else if(x[i]>smax && x[i]<fmax)
			{
				smax=x[i];
			}
		}
		System.out.print("Second maximum number is :- "+smax);
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :- ");
		int s=sc.nextInt();
		
		int []a=new int[s];
		System.out.print("Enter the element of the array one by one :-");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Secondmax(a);
		sc.close();
	}
}
