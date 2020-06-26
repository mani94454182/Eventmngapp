package com.ems.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ems.app.controller.EventController;
//import com.ems.app.controller.EventController;
import com.ems.app.dao.EventRepository;
import com.ems.app.security.EventAuthentication;
import com.ems.app.service.EventService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//represent IOC container
    	
    //	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventManagementConfiguration.class);
        
    //EventController eventController = (EventController) context.getBean("ec");
		
		
		  EventController eventController = context.getBean(EventController.class);
		
		  EventController eventController2 = context.getBean(EventController.class);
		  
		  EventAuthentication eventAuthentication= (EventAuthentication)context.getBean("getEA1");
		  
		  eventAuthentication.printMessage();
		  //this acts as an instruction to IOC container to shutdown its state of container
		 // context.close();
		  
		  //Register a shutdown hook named SpringContextShutdownHook with the JVM runtime, closing this context on JVM shutdown unless it has already been closed at that time. 
           context.registerShutdownHook();
		  
		  //EventController eventController3 = context.getBean(EventController.class);
		  //System.out.println(eventController1==eventController2);
		 
    	String str=eventController.getEventDetails();
    	System.out.println(str);
    	
		
		/*
		 * String arr[]=context.getBeanNamesForType(EventService.class);
		 * 
		 * for(String name: arr) { System.out.println(name); }
		 */
		 
    	System.out.println("helllo Megha");
       // EventController eventController = new EventController();
       // System.out.println(eventController.getEventDetails());
    }
}
