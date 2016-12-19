package info.vellyezz.springtutorial;

import info.vellyezz.springtutorial.api.Logger;
import info.vellyezz.springtutorial.api.UsersRepository;
import info.vellyezz.springtutorial.implementations.LoggerImpl;
import info.vellyezz.springtutorial.implementations.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		usersRepository.createUser("Jan");
		
		
	}

}
