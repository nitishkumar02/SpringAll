package com.nk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
///spring-demo/src/BeanLifeScope-applicationContext2.xml
public class BeanLifeCycleDemoApp2 
{
public static void main(String[] args)
{
	// load the spring configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeScope-applicationContext2.xml");
     
	//get the bean
	Coach theCoach = context.getBean("myCoach", Coach.class);
	
	//call the method
	System.out.println(theCoach.getDailyWorkOut()); 
	
	
	//close the context
	context.close();
}
}
