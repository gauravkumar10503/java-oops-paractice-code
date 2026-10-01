package array_with_function;

import java.util.*;
public class Multi_Odd_Add_Even 
{
	//for odd
	public static void oddno(int []x)
	{
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]%2!=0)
			{
				x[i]*=2;
			}
		}
		System.out.println("Odd index array :-"+Arrays.toString(x));
	}
	
	//for even
	public static void evenno(int []y)
	{
		for(int i=0;i<=y.length-1;i++)
		{
			if(y[i]%2==0)
			{
				y[i]+=10;
			}
		}
		System.out.println("Even index array :- "+Arrays.toString(y));
	}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :- ");
		int s=sc.nextInt();
		
		int []a=new int[s];
		System.out.println("Enter the element of the array one by one :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array :- "+Arrays.toString(a));
		
		evenno(a);
		oddno(a);
		System.out.print("Modifie Arrays :- "+Arrays.toString(a));
		sc.close();
	}
}
