package com.nk.spring;

public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Play 5 shots";
	}

	@Override
	public String getDailyFortune() {
		
		return "Play 5 shots";
	}
   public void doStartUpStuff()
   {
	   System.out.println("At The Start of Bean");
   }
   
   public void doShutCleanUpStuff()
   {
	   System.out.println("After the Bean is destroyed");
   }
}
