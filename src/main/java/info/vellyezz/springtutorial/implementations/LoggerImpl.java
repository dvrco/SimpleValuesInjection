package info.vellyezz.springtutorial.implementations;

import java.util.Date;

import info.vellyezz.springtutorial.api.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {
		// TODO Auto-generated method stub
		
		System.out.println(new Date() + ": " + message);

	}

}
