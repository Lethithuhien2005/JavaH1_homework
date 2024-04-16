package Eg_chapter5;

public class Book {
	private String title;
	private Person author;
	private int pages;
	private double price;

	public Book( String title, Person author, int pages, double price) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void details() {
		System.out.println("Title : " + title);
		System.out.println("Author name : " + author.getName());
		System.out.println("Pages : " + pages);
		System.out.println("Price : " + price);
	}
}
