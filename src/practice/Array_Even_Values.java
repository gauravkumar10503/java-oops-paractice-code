package practice;
import java.util.*;
public class Array_Even_Values 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :- ");
		int size=sc.nextInt();
		
		int []a=new int[size];
		System.out.println("Enter the value of array one by one ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even elements of the array :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
