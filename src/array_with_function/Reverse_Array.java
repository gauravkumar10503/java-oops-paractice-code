package array_with_function;

import java.util.*;
public class Reverse_Array 
{
	public static void reverse(int []x)
	{
		int b=0;
		int c=x.length-1;
		while(b<c)
		{
			int temp=x[b];
			x[b]=x[c];
			x[c]=temp;
			b++;
			c--;
		}
		System.out.print("Reverse Array :- "+Arrays.toString(x));
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
		
		System.out.print("Original Array :- ");
		for(int arr : a)
		{
			System.out.print(arr+" ");
		}
		System.out.println();
		reverse(a);
		sc.close();
	}
}
