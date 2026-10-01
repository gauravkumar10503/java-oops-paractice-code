package array;

import java.util.*;
public class Checking_Array_Is_Sorted_Ornot
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
		
		System.out.println("Checking array is sorted or not :- ");
		for(int i=1;i<=a.length;i++)
		{
			if(a[i]>a[i-1])
			{
				System.out.println("Array is not sorted ");
				break;
			}
		}
	}
}