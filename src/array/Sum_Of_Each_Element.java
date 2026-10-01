/*WAPT read an int array and print sum of digits of each element.
example : {123, 456, 326, 894}
output : 
123 - 6
456 - 15
326 - 11
894 - 21*/
package array;
import java.util.Scanner;
public class Sum_Of_Each_Element 
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
		
		for(int i=0;i<=a.length-1;i++)
		{
			int n=a[i];
			int sum=0;
			while(n!=0)
			{
				int last=n%10;
				sum=sum+last;
				n=n/10;
			}
			System.out.println("Sum of the element is :- "+sum);
			
		}
		sc.close();
	}
}
