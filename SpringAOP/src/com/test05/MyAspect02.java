package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;


// 환경설정 beans.xml <aop:>로 선언
public class MyAspect02 {
	
	@Before("myClass()")
	public void before(JoinPoint joinPoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석체크 ");
	}

	@After("myClass()")
	public void After(JoinPoint joinPoint) {
		System.out.println("로그아웃 한다.");
	}
}
