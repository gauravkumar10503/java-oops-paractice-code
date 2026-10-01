/*Create a class with a private variable and access it using a 
public gettermethod.*/

package practice;

public class Public_Private_Access_Modifier 
{
	public static void main(String[]args)
	{
		Book b=new Book("The story of mine ","Anku");
		b.showinfo();
		
		System.out.println("----------------------------------------------");
		
		b.setname("The sad story of mine");
		b.showinfo();
	}
}


class Book
{
	private String name;
	public String author;
	public Book(String name,String author)
	{
		this.name=name;
		this.author=author;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String newname)
	{
		this.name=newname;
	}
	public void showinfo()
	{
		System.out.println("Book name :- "+name);
		System.out.println("Author name :- "+author);
	}
}

