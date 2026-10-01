/*WAPT read an int array and print how many distinct elements are there 
in the array.*/
package array;
import java.util.Scanner;
public class Distinct_Element_Array
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
		
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			boolean found=false;
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]==a[i])
				{
					found=true;
					break;
				}
			}
			if(found==false)
			{
				count++;
			}
		}
		System.out.println("Distinct number of element is :- "+count);
	}
}
