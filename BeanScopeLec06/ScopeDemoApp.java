package com.nk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoApp 
{
public static void main(String[] args)
{
	// load the spring configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");

	Coach theCoach = context.getBean("myCoach", Coach.class);
	Coach alphaCoach = context.getBean("myCoach", Coach.class);
	
	// check if they are same
	
	boolean result = (theCoach==alphaCoach);
	
	// print the result
	System.out.println("\n Pointing the same Object : " + result);
	System.out.println("\n Meomry Location for theCoach " + theCoach);
	System.out.println("\n Meomry Location for theCoach " + theCoach);
	
	
	
	Coach theCoach1 = context.getBean("myCoach2", Coach.class);
	Coach alphaCoach1 = context.getBean("myCoach2", Coach.class);
	// check if they are same
	
	boolean result2 = (theCoach1==alphaCoach1);
	// print the result
	System.out.println("\n Pointing the same Object : " + result2);
	System.out.println("\n Meomry Location for theCoach1 " + theCoach1);
	System.out.println("\n Meomry Location for theCoach1 " + alphaCoach1);
}
}
