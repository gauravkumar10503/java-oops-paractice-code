 /*WAPT read an integer array from user and print only even elements 
 form the array.*/
package array;
import java.util.Scanner;
public class Even_Array_Elements 
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
		
		System.out.print("Even elements of the given array :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		sc.close();
		
	}
}
