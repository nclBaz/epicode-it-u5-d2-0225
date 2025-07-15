package riccardogulin.u5d2;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import riccardogulin.u5d2.dao.UsersDAO;

// I Runner devono avere 2 caratteristiche:
// 1. Implementare l'interfaccia CommandLineRunner
// 2. Essere dei @Component

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	private UsersDAO usersDAO;

	@Autowired
	private Faker faker;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ciao dal runner");

		System.out.println(faker.backToTheFuture().character());
		usersDAO.save();
		usersDAO.findById();
	}
}
