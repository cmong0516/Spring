package book;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book("SQL Plus",50000,5.0);
		Book book2 = new Book("Java 2.0",40000,3.0);
		Book book3 = new Book("JSP Servlet",60000,6.0);
		System.out.println("책이름\t\t가격\t할인율\t할인후금액");
		System.out.println("----------------------------------------");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
	}
}
