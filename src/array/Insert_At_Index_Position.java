//WAPT to insert an element at the given index.
package array;
import java.util.Arrays;
import java.util.Scanner;
public class Insert_At_Index_Position 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :- ");
		int size=sc.nextInt();
		
		int []a=new int[size];
		System.out.print("Enter the elements of the array :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the value of n :- ");
		int n=sc.nextInt();
		
		System.out.print("Enter the index's position :- ");
		int index=sc.nextInt();
		
		int []b=new int[a.length+1];
		for(int i=0;i<=b.length-1;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else if(i==index)
			{
				b[index]=n;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		System.out.print("B'array :- "+Arrays.toString(b));
		sc.close();
	}
}
