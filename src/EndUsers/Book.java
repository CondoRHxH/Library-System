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
	
	public String toString() {
		String text = "The name " + name+ " The Author " +author+" The publisher : " +publisher+" The adress : "+adress+ " the status : "+status+" The QTY : "+
				String.valueOf(qty)+ " The Price " +String.valueOf(price)+ "The Copies borrowed " +String.valueOf(brwcopies);
		return text;
	}
	public String getName() {
		return name;
	}
	public String toString2() {
		String text = name+"<N/>"+author+"<N/>"+publisher+"<N/>"+adress+"</N>"+String.valueOf(qty)+"</N>"+String.valueOf(price)+"<N/>"+String.valueOf(brwcopies);
		return text;
	}
}
