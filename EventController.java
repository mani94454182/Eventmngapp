package com.ems.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ems.app.service.EventService;

@Component
//@Scope(value="prototype")
public class EventController {

	@Autowired
	EventService eventService; //= new EventService();
	  

	public EventController() {
		System.out.println("Constructor Invoke");
		
	}


	public EventController(EventService eventService) {
		System.out.println("controller eventservice setter called");
		this.eventService = eventService;
	}


	public void setEventService(EventService eventService) {
	  System.out.println("controller eventservice setter called");
	  this.eventService = eventService; }
	 
	
	public String getEventDetails() {
		return eventService.parseEventDetails();
	}
}
