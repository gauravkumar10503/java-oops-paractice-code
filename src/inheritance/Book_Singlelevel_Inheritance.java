//Class Book with title, author, isbn. Extend Novel with genre, rating.
package inheritance;

public class Book_Singlelevel_Inheritance
{
	public static void main(String[]args)
	{
		Novel n=new Novel("Godaan","Premchandra",1265,"Life moral",9.5);
		n.ninfo();
	}
}

class Book
{
	public String title;
	public String author;
	public int isbn;
	public Book(String title,String author,int isbn)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public void bookinfo()
	{
		System.out.println("Book name :- "+title);
		System.out.println("Author's name :- "+author);
		System.out.println("ISBN no :- "+isbn);
	}
}

class Novel extends Book
{
	public String genre;
	public double rating;
	public Novel(String title,String author,int isbn,String genre,double rating)
	{
		super(title,author,isbn);
		this.genre=genre;
		this.rating=rating;
	}
	public void ninfo()
	{
		bookinfo();
		System.out.println("Book's genre :- "+genre);
		System.out.println("Rating :- "+rating);
	}
}