package com.nk.springannotation;

import org.springframework.stereotype.Component;
// it will register
@Component("TennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDaiilyWorkOut() {
		return "Praactice Tennis";
	}

}
