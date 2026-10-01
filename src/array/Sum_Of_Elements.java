//WAPT read an double array and print sum of all the elements.
package array;
import java.util.Scanner;
public class Sum_Of_Elements 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :- ");
		int size=sc.nextInt();
		
		double []a=new double[size];
		System.out.print("Enter the elements of the array :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextDouble();
		}
		
		double sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.print("The sum of given array is :- "+sum);
		sc.close();
	}
}
