package project;

public class Book 
{
	private String title;
	private int id;
	private String author;
	private int cost;
	private int noOfPages;

	public Book() {
	}

	public Book(String title, int id, String author, int cost, int noOfPages) {
		super();
		this.title = title;
		this.id = id;
		this.author = author;
		this.cost = cost;
		this.noOfPages = noOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	public void display()
	{
		System.out.println("Book Title is:"+getTitle());
		System.out.println("Book ID:"+getId());
		System.out.println("Book Cost:"+getCost());
		System.out.println("Book Author:"+getAuthor());
		System.out.println("Book noOfPages:"+getNoOfPages());
		System.out.println("===================================");
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", id=" + id + ", author=" + author + ", cost=" + cost + ", noOfPages="
				+ noOfPages + "]\n";
	}

	
}


