package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/test02/Beans.xml");
		Person p = ac.getBean("student",Person.class);
		p.classWork();
	}
}
