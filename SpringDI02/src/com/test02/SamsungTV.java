package com.test02;

import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTV implements TV {
	
	public SamsungTV() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("SamsungTV ---  객체를 생성.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ---  전원을 켠다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ---  전원을 끈다.");
	}

	@Override
	public void volumnUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ---  소리를 높인다");
	}

	@Override
	public void volumnDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV ---  소리를 낮춘다.");
	}

}
