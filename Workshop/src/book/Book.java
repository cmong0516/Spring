package book;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;

	public Book() {
		super();
	}

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public double getDiscountBookPrice(Book book) {
		double discountBookPrice;
		discountBookPrice = book.bookPrice - ((book.bookPrice * book.bookDiscountRate)/100);
		return discountBookPrice;
	}

	@Override
	public String toString() {
		return bookName+"\t"+bookPrice+"원\t"+bookDiscountRate+"%\t"+getDiscountBookPrice(this)+"원";
	}
	
}
