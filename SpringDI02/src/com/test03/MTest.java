package com.test03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MTest {	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		 ctx.register(AppConfig.class);
		 ctx.refresh();
		 
		 School st = ctx.getBean("school",School.class);
		 System.out.println(st.toString());
	}
}
