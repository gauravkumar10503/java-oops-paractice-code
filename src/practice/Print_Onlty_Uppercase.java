package practice;

public class Print_Onlty_Uppercase 
{
	public static void main(String[]args)
	{
		String s="HeLLo";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			{
				if(ch>='A'&&ch<='Z')
				{
					System.out.println(ch);
				}
			}
		}
	}
}
