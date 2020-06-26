package com.ems.app.supplementry;

import org.springframework.stereotype.Component;

@Component("B")
public class B implements IInterface {

	
	public void disp() {
		System.out.println("Hi, I am B");
	
	}
}
