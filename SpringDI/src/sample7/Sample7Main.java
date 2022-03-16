package sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample7Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("sample7/applicationContext.xml");
		
		Parent obj = ac.getBean("child02",Parent.class);
		System.out.println(obj.getEmail());
		obj = ac.getBean("child",Parent.class);
		System.out.println(obj.getEmail());
//		obj = ac.getBean("myparent",Parent.class);
//		System.out.println(obj.getEmail());
	}
}
