package project;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LibraryClass l=new LibraryClass();
		boolean start=true;
		while(start)
		{
			System.out.println("Enter your choice:\n 1.AddBook \n 2.DisplayBook \n 3.SearchBookById \n 4.SearchBookByAuthor \n 5.UpdateBookCostByTitle \n 6.RemoveBookById \n 7.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			  case 1:
			  {
				System.out.println("enter the book title:");
				String title=sc.next();
				System.out.println("enter the book Id:");
				int id=sc.nextInt();
				System.out.println("enter the book author:");
				String author=sc.next();
				System.out.println("enter the book cost:");
				int cost=sc.nextInt();
				System.out.println("enter the noOfPages:");
				int noOfPages=sc.nextInt();
				l.addBook(new Book(title,id,author,cost,noOfPages));
			  }
			  break;
			  case 2:
			  {
				  l.displayBooks();
			  }
			  break;
			  case 3:
			  {
				  System.out.println("enter the Book Id:");
				  int id=sc.nextInt();
				  l.serachBooksBasedOnId(id);
			  }
			  break;
			  case 4:
			  {
				  System.out.println("enter the Book Author:");
				  String author=sc.next();
				  l.searchBookBasedOnAuthor(author);
			  }
			  break;
			  case 5:
			  {
				  System.out.println("Enter the Book Title:");
				  String title=sc.next();
				  l.updateCostByTitle(title);
			  }
			  break;
			  case 6:
			  {
				  System.out.println("enter book Id:");
				  int id=sc.nextInt();
				  l.removeBookById(id);
			  }
			  break;
			  case 7:
			  {
				  start=false;
				  System.out.println("Thank You..........");
			  }
			  break;
			  default:System.out.println("enter valid choice:");
			}
		}
	}


}
