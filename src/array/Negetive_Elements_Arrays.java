//WAPT read an int array and print only negetive elements.
package array;
import java.util.Scanner;
public class Negetive_Elements_Arrays
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :- ");
		int size=sc.nextInt();
		
		int []a=new int[size];
		System.out.print("Enter the elements of the array one by one :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Negetive elements of the given array is :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" ");
			}
		}
		sc.close();
	}
}
