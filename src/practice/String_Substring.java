/*WAPT print all the substrings of a given String
input : ABCD
A
AB
ABC
ABCD
B
BC
BCD
C
CD
D*/

package practice;

public class String_Substring 
{
	public static void main(String[]args)
	{
		String s="ABCD";
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
	}
}
