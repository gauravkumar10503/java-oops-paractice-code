/*WAPT read an array and reverse the given array.
input : {23, 54, 12, 44, 35}
output :{35, 44, 12, 54, 23}
Note : you should reverse elements in the same array.*/
package array;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse_Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :- ");
		int size=sc.nextInt();
		
		int[]a=new int[size];
		System.out.print("Enter the elements of the array :- ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int x=0;
		int y=a.length-1;
		while(x<y)
		{
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
		}
		System.out.print("Reverse array a :- "+Arrays.toString(a));
		sc.close();
	}
} 
