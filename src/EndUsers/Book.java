package EndUsers;

public class Book{

	private String name;
	private String author;
	private String publisher;
	private String adress;
	private String status;
	private int qty;
	private double price;
	private int brwcopies;
	
	public Book() {};
	
	public Book(String name,String author,String publisher, String adress, String status, int qty, double price, int brwcopies) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.adress = adress;
		this.status = status;
		this.qty = qty;
		this.price = price;
		this.brwcopies = brwcopies;
	}
	
	
}
