package array_with_function;

import java.util.*;
public class Tcs_Array_Question 
{
	static int sum;
	static int count;
	static int avg;
	//finding odd number
	public static void odd(int []x)
	{
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]%2!=0)
			{
				count++;
			}
		}
	}
	
	//finding sum of odd number
	public static void add(int []y)
	{
		for(int i=0;i<=y.length-1;i++)
		{
			if(y[i]%2!=0)
			{
				sum+=y[i];
			}
		}
	}
	
	//finding average of the odd element
	public static void average(int []z)
	{
		avg=sum/count;
	}
	
	//main function
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :- ");
		int s=sc.nextInt();
		
		int []a=new int[s];
		System.out.println("Enter the element of the array one by one:- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array :- "+Arrays.toString(a));
		
		//calling other function
		odd(a);
		System.out.println("Number of odd in Given array is :- "+count);
				
		add(a);
		System.out.println("The sum of the odd array is :- "+sum);
		
		average(a);
		System.out.println("Average of the odd element of the array is :- "+avg);
		sc.close();
	}
}
