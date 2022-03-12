package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(7,5,"Blue");
		Rectangle r1 = new Rectangle(4,6,"Blue");
		Triangle t2 = new Triangle(6,7,"Red");
		Rectangle r2 = new Rectangle(8,3,"Red");
		Triangle t3 = new Triangle(9,8,"White");
		Rectangle r3 = new Rectangle(5,7,"White");
		
		Shape[] shape = {t1,r1,t2,r2,t3,r3};
		System.out.println("기본정보");
		for(int i=0;i<shape.length;i++) {
			 System.out.println(shape[i].toString());
		}
		System.out.println("\n");
		t1.setResize(5);
		t2.setResize(5);
		t3.setResize(5);
		r1.setResize(5);
		r2.setResize(5);
		r3.setResize(5);
		System.out.println("사이즈를 변경 후 정보");
		for(int i=0;i<shape.length;i++) {
			 System.out.println(shape[i].toString());
		}
		
	}
}
