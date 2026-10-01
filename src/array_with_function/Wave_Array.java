package array_with_function;

import java.util.*;
public class Wave_Array 
{
	public static void wave(int []x)
	{
		for(int i=0;i<x.length-1;i=i+2)
		{
			int temp = x[i];
            x[i] = x[i+1];
            x[i+1] = temp;
		}
		System.out.print("Wave Array :- "+Arrays.toString(x));
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
		Arrays.sort(a);
		wave(a);
		sc.close();
	}
}
