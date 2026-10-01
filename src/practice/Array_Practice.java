package practice;

import java.util.*;
public class Array_Practice 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array ");
		int s=sc.nextInt();
		
		int []a=new int[s];
		System.out.println("Enter the elemeent of thea array one by one ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		//int []deep=Arrays.copyOf(a, s);  deep copy of array
		change(a);
		System.out.println(a[2]);
		System.out.println("arrays :- "+Arrays.toString(a));
		sc.close();
	}
	public static void change(int []y)
	{
		y[2]=99;
	}
}
