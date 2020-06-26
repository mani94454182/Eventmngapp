package com.ems.app.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ems.app.model.Event;

//@Component
@Repository
public class EventRepository {
	
	//SPel-SpringExpression language
	@Value("${event.location}")
	String venue;
	
	public Event getOneEvent() {
		
		return new Event(111,"Spring",venue,5367.8f);
		
	}

}
