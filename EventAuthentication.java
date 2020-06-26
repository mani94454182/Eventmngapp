package com.ems.app.security;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//import javax.annotation.PostConstruct;
import com.ems.app.dao.EventRepository;
import com.ems.app.supplementry.A;
import com.ems.app.supplementry.IInterface;


public class EventAuthentication {
	String message;
	
	@PostConstruct
	public void creation() {
		System.out.println("Instance Verified");
	}
	
	@PreDestroy
	public void deletion() {
		System.out.println("Instance Resource are Released");
	}
	
	public EventAuthentication(String message) {
		this.message = message;
	}
	
	@Autowired
	@Qualifier("B")
	IInterface obj;//provide instance either A or B
	public void printMessage() {
		//System.out.println(this.message);	
		obj.disp();
	}


	EventRepository eventRepository = new EventRepository();

}
