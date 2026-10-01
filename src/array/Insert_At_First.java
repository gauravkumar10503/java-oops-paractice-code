//WAPT to insert an element at first of the array.
package array;
import java.util.Arrays;
import java.util.Scanner;
public class Insert_At_First
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
		int []b=new int[a.length+1];
		for(int i=0;i<=a.length-1;i++)
		{
			b[i+1]=a[i];
		}
		b[0]=n;
		System.out.print("B'array :- "+Arrays.toString(b));
		sc.close();
	}
}
