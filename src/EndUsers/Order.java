package EndUsers;

public class Order {

	private Book book;
	private User user;
	private double price;
	private int qty;
	
	public Order(Book book, User user, double price, int qty) {
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return "Book Name : "+book.getName()+"\n"+
				"User Name : "+user.getName()+"\n"+
				"Price: "+String.valueOf(price)+"\n"+
				"Quantity : "+String.valueOf(qty)+"\n";
	}
	
	public String toString2() {
		return book.getName()+"<N/>"+user.getName()+"<N/>"+String.valueOf(price)+"<N/>"+String.valueOf(qty);
	}
}
