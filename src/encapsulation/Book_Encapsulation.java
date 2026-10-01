/*Read-only Field

Problem: Create a Book class with title and author. Make author read-only.
Next Steps:

private final String author;

Provide a getter but no setter for author.*/
package encapsulation;

public class Book_Encapsulation 
{
	public static void main(String[]args)
	{
		Book b=new Book("The overthinking cure ","Nick trontan");
		b.getauthor("Nick trontan");
		System.out.println("Author name :- "+b.getauthor("Nick trontan"));
	}
}

class Book
{
	private String title;
	private final String author;
	public Book(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	public String getauthor(String author)
	{
		return author;
	}
}