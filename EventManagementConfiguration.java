package com.ems.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.ems.app.controller.EventController;
import com.ems.app.dao.EventRepository;
import com.ems.app.security.EventAuthentication;
import com.ems.app.service.EventService;

@Configuration
@ComponentScan //(basePackages= {"com.ems.app"})
@PropertySource (value= {"classpath:/application.properties"},ignoreResourceNotFound=true)
//@Scope("prototype")// class level
public class EventManagementConfiguration {
	
	@Bean
	@Profile({"testing","development"})
	public EventAuthentication getEA1() {
		return new EventAuthentication("Sabari");
	}
	
	@Bean
	@Profile({"development"})
	public EventAuthentication getEA2() {
		return new EventAuthentication("Meghana");
	}
	/*
	 * @Bean public EventRepository getER() { EventRepository er=new
	 * EventRepository(); return er; }
	 * 
	 * @Bean({"Meghana"}) public EventService getES() { EventService es=new
	 * EventService(); //EventService es=new EventService(getER());
	 * //es.setEventRepository(getER()); return es; }
	 * 
	 * @Bean //@Scope("prototype")// Method level public EventController getEC() {
	 * //System.out.println("Instance created"); EventController ec= new
	 * EventController(); //EventController ec= new EventController(getES());
	 * //ec.setEventService(getES()); return ec; }
	 */
	
}
