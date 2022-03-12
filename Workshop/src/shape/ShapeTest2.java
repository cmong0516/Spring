package shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ShapeTest2 {

	public static void main(String[] args) {
		System.out.println("기본정보");
		ApplicationContext ac = new ClassPathXmlApplicationContext("shape/shape.xml");
		Triangle t1 = ac.getBean("t1", Triangle.class);
		System.out.println(t1.toString());
		Rectangle r1 = ac.getBean("r1", Rectangle.class);
		System.out.println(r1.toString());
		Triangle t2 = ac.getBean("t2", Triangle.class);
		System.out.println(t2.toString());
		Rectangle r2 = ac.getBean("r2", Rectangle.class);
		System.out.println(r2.toString());
		Triangle t3 = ac.getBean("t3", Triangle.class);
		System.out.println(t3.toString());
		Rectangle r3 = ac.getBean("r3", Rectangle.class);
		System.out.println(r3.toString());
		
		t1.setResize(5);
		t2.setResize(5);
		t3.setResize(5);
		r1.setResize(5);
		r2.setResize(5);
		r3.setResize(5);
		
		System.out.println();
		System.out.println("사이즈를 변경 후 정보");
		System.out.println(t1.toString());
		System.out.println(r1.toString());
		System.out.println(t2.toString());
		System.out.println(r2.toString());
		System.out.println(t3.toString());
		System.out.println(r3.toString());
		
	}
}
