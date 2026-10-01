//WAPT read two int arrays and merge them.
package array;
import java.util.Arrays;
import java.util.Scanner;
public class Merge_Two_Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array  a:- ");
		int size=sc.nextInt();
		
		int []a=new int[size];
		System.out.print("Enter the elements of array :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the size of array b :- ");
		int size2=sc.nextInt();
		
		int []b=new int[size2];
		System.out.print("Enter the element of b's array :- ");
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int size3=(a.length+b.length);
		System.out.println("Array c size :- "+size3);
		
		int []c=new int[size3];
		for(int i=0;i<=c.length-1;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i-a.length];
			}
		}
		System.out.print("Merge of two arrays :- "+Arrays.toString(c));
		sc.close();
	}
}
