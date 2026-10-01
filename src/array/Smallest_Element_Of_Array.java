//WAPT read an int array and print the smallest element in the array
package array;
import java.util.Scanner;
public class Smallest_Element_Of_Array
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
		
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Smallest element of the given array :- "+min);
		sc.close();
	}
}
