package info.vellyezz.springtutorial.implementations;

import info.vellyezz.springtutorial.api.Logger;
import info.vellyezz.springtutorial.api.UsersRepository;
import info.vellyezz.springtutorial.domain.User;

public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;
	
	public User createUser(String name) {
		// TODO Auto-generated method stub
		logger.log("Tworzenie urzytkownika " + name); 
		return new User(name);
	}

	public void setLogger(Logger logger) {
		// TODO Auto-generated method stub

		this.logger = logger;
		
		
	}

}
