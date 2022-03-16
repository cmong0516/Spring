package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Autowired
	private HelloDao hellodao;
	
//	Autowired기능
//	public HelloService(HelloDao hellodao) {
//		this.hellodao = hellodao;
//	}
//	public void setHelloDao(HelloDao hellodao) {
//		this.hellodao = hellodao;
//	}
	
	public String getHello() {
		return hellodao.getHello(); 
	}
}
