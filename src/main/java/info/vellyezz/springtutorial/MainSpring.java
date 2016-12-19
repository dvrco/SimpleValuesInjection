package info.vellyezz.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.vellyezz.springtutorial.api.UsersRepository;
import info.vellyezz.springtutorial.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UsersRepository usersRepository = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);

		User janek = usersRepository.createUser("janek");

	}

}
