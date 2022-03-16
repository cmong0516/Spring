package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


// @로 호출
@Component("myAdvice")
@Aspect
public class MyAspect {
	
	// myClass()라는 별칭을 주면 아래에서 별칭을 찾아가서 ("execution(* classWork())")을 찾는다.
	@Pointcut("execution(* classWork())")
	private void myClass() { // private, (), {}
		
	}

	@Before("myClass()")
	public void before(JoinPoint joinPoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석체크 ");
	}

	@After("myClass()")
	public void After(JoinPoint joinPoint) {
		System.out.println("로그아웃 한다.");
	}

}
