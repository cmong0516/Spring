package com.test01.Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MyTest")
public class Nic_NamePrn {
	
	@Autowired
	Nic_Name nic_name;
	
	@Override
	public String toString() {
		return "Nic_NamePrn [nic_name=" +nic_name+"]";
	}
}
