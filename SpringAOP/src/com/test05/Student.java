package com.test05;

import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Person {

	@Override
	public void classWork() {

		System.out.println("[학생]은 줌을 키고 수업을 참여한다. ");
	}

}
