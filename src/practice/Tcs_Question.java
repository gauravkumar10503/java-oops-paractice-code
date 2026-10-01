package practice;

import java.util.*;
public class Tcs_Question 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :- ");
		int s=sc.nextInt();
		
		int []a=new int[s];
		System.out.print("Enter the elements of the array one by one :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//for printing the array
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		//for knowing the odd 
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
		}
		System.out.println("Number of odd no is :- "+count);
		
		//for sum of the odd
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of odd no is :- "+sum);
		
		//for avaerage of the 
		int avg=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				avg=sum/count;
			}
		}
		System.out.println("Average of the odd is :- "+avg);
		sc.close();
	}
}
