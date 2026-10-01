//WAPT read an int array and print product of only positive elements.
package array;
import java.util.Scanner;
public class Product_Of_Postive_Elements 
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
		
		
		int product=1;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>0)
			{
				product=product*a[i];
			}
		}
		System.out.print("The product of position elements of the array is :- "+product);
		sc.close();
	}
}
