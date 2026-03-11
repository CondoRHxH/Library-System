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
		String text = name+"<N/>"+author+"<N/>"+publisher+"<N/>"+adress+"<N/>"+String.valueOf(qty)+"<N/>"+String.valueOf(price)+"<N/>"+String.valueOf(brwcopies);
		return text;
	}
	

	void setBrwcopies(int int1) {
		this.brwcopies = int1;
		
	}

	void setPrice(double double1) {
		this.price = double1;
	}

	void setQty(int int1) {
		this.qty = int1;		
	}

	void setAdress(String string) {
		this.adress = string;
		
	}

	void setPublisher(String string) {
		this.publisher = string;
		
	}

	void setAuthor(String string) {
		this.author =string;
		
	}

	void setName(String string) {
		this.name = string;
		
	}

	public String getPublisher() {
		// TODO Auto-generated method stub
		return publisher;
	}
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	public String getAdress() {
		// TODO Auto-generated method stub
		return adress;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	public int getQty() {
		// TODO Auto-generated method stub
		return qty;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public int getBrwcopies() {
		// TODO Auto-generated method stub
		return brwcopies;
	}
}
