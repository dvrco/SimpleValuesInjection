package info.vellyezz.springtutorial.api;

import info.vellyezz.springtutorial.domain.User;

public interface UsersRepository {

	User createUser(String name);
	void setLogger(Logger logger);
	
}
