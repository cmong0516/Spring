package sample9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample9Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample9/applicationContext.xml");
		MyFoodMgr obj = factory.getBean("myFood", MyFoodMgr.class);
		System.out.println(obj.toString());
	}

}
