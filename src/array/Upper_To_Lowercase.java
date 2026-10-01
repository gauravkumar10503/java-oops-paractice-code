package array;

public class Upper_To_Lowercase 
{
	public static void main(String[]args)
	{
		String s="HELLO";
		String l="";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			l=l+ch;
		}
		System.out.println(l);
		//System.out.print(l.toLowerCase());  inbulid function
	}
}
