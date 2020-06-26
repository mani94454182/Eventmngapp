package com.ems.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ems.app.dao.EventRepository;
import com.ems.app.model.Event;

@Component
public class EventService {
	
	@Autowired
	EventRepository eventRepository; //= new EventRepository();
	
	
	  public EventService() {
		
	}


	public EventService(EventRepository eventRepository) {
		System.out.println("service evnetrepository constructor called");
		this.eventRepository = eventRepository;
	}



	public void setEventRepository(EventRepository eventRepository) {
	  System.out.println("service evnetrepository setter called");
	  this.eventRepository = eventRepository; }
	 
	
	
	  public String parseEventDetails() {
		  Event event = eventRepository.getOneEvent(); 
	      return "Event Name:" +event.getEventName()+" Venue:"+event.getEventAddress(); 
	  }
	 

}
