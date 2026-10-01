package practice;

public class PrintSpecialCharacter {

	public static void main(String[] args) {
		String s="ABcde3456@#";
		int c=0;
		int l=0;
		int n=0;
		int d=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			{
				if(ch>='A'&&ch<='Z')
				{
					c++;
				}
				else if(ch>='a'&&ch<='z')
				{
					l++;
				}
				else if(ch>='0'&&ch<='9')
				{
					n++;
				}
				else
				{
					d++;
				}
			}
		}System.out.println("Number of Uppercase="+c);
		System.out.println("Number of lowercase="+l);
		System.out.println("Number of digits="+n);
		System.out.println("Number of special character="+d);

	}

}
