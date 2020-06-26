package com.ems.app.supplementry;

import org.springframework.stereotype.Component;

@Component("A")
public class A implements IInterface {
	
	public void disp() {
		System.out.println("Hi, I am A");
		
	}

}
