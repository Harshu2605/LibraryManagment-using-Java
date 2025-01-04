package project;

import java.util.ArrayList;
import java.util.Iterator;

public class LibraryClass 
{
	public Book b;
	private ArrayList<Book> book=new ArrayList<Book>();
	
	//AddBooks
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book Added Succesfully.....");
	}
	
	//DisplayBooks
	public void displayBooks()
	{
		if(book.isEmpty())
		{
			System.out.println("No Books are Added Yet!..........");
		}
		else
		{
			for(Book b:book)
			{
				b.display();
			}
		}
	}
	
	//SearchBooksBasedOnID
	public void serachBooksBasedOnId(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("No Books are Added Yet!..........");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getId()==id)
				{
					System.out.println("Book Found:"+b.getTitle());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("You entered invalid ID,Book not found");
		}
	}
	
	//SearchBookBasedOnAuthor
	public void searchBookBasedOnAuthor(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not added Yet....");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getAuthor().equalsIgnoreCase(author))
				{
			        System.out.println("Book Found:"+b.getTitle()+" written by "+b.getAuthor());
			        isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("You entered invalid authorname,Book not found");
		}
	}
	
	//UpdateBookCostbasedonTitle
	public void updateCostByTitle(String title)
	{
		 boolean isUpdate=false;
		 if(book.isEmpty())
		 {
			System.out.println("Books are not added Yet....");
		 }
		 else
		 {
			 for(Book b:book)
			 {
				 if(b.getTitle().equalsIgnoreCase(title))
				 {
					 System.out.println("Book cost updateD");
					 b.setCost(5000);
					 isUpdate=true;
				 }
			 }
		 }
		 if(isUpdate==false)
		 {
			 System.out.println("you entered invalid title..Updation Failed");
		 }
		 
	}
	
	//removeBookById
	public void removeBookById(int id)
	{
		boolean isremoved=false;
		Iterator<Book> itr=book.iterator();
		if(book.isEmpty())
		{
			System.out.println("Books are not added Yet....");
		}
		else
		{
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getId()==id)
				{
					itr.remove();
					System.out.println("Book removed successfully");
					isremoved=true;
				}
			}
		}
		if(isremoved==false)
		{
			 System.out.println("you entered invalid ID..no Book is removed");
		}
		
	}
	

}
