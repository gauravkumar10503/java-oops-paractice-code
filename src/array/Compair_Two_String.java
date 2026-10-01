package array;

public class Compair_Two_String 
{
	public static void main(String[]args)
	{
		String s="ABC";
		String s2="ABD";
		
		boolean equal=true;
		if(s.length()!=s2.length())
		{
			System.out.println("String are not equals ");
		}
		else
		{
			for(int i=0;i<=s.length()-1;i++)
			{
				if(s.charAt(i)!=s2.charAt(i))
				{
					equal=false;
					break;
				}
			}
			if(equal)
			{
				System.out.print("Both string are equals ");
			}
			else
			{
				System.out.print("Both string are not equals ");
			}
		}
	}
}
