package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05MTest {

	public static void main(String[] args) {

		// 1.context load
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/test05/beans.xml"); //beans.xml에 bean태그가 전부 메모리에 올라감
		
		// 3.getBean의 student호출
		Person ps = ac.getBean("student", Person.class);
		// 4. 메소드를 실행하면 호출과 동시에 beans.xml의 value="execution(public * *(..))"이 안다.-> .xml의 advice에게 가로채서 던져준다.
		ps.classWork();
		
		((AbstractApplicationContext) ac).close();
		
	}

}
