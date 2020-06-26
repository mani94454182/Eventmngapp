package com.ems.app.model;

public class Event {
	
	private int eventId;
	private String eventName;
	private String eventAddress;
	private float eventPrice;
	
//	public Event() {
		
	//}
	public Event(int eventId, String eventName, String eventAddress, float eventPrice) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventAddress = eventAddress;
		this.eventPrice = eventPrice;
	}
	
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventAddress() {
		return eventAddress;
	}
	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}
	public float getEventPrice() {
		return eventPrice;
	}
	public void setEventPrice(float eventPrice) {
		this.eventPrice = eventPrice;
	}
	
	

}
