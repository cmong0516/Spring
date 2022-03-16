package com.test02;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Lazy()
@Component("lg")
public class LgTV implements TV{
	
	public LgTV() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("LgTV 객체가 생성되었어요.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV ---  전원을 켠다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV ---  전원을 끈다.");
	}

	@Override
	public void volumnUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTV ---  소리를 높인다.");
	}

	@Override
	public void volumnDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV ---  소리를 낮춘다.");
	}

}
