package array;

import java.util.*;
public class Second_Largest_Element 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :- ");
		int size=sc.nextInt();
		
		int []a=new int[size];
		System.out.print("Enter the element of the array one by one :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int fmax=a[0];
		int smax=-1;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax && a[i]<fmax)
			{
				smax=a[i];
			}
		}
		System.out.println("Second largest element of given array :- "+smax);
	}
}
