package riccardogulin.u5d2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import riccardogulin.u5d2.dao.UsersDAO;

@Component
public class MyRunner2 implements CommandLineRunner {
	@Autowired
	private UsersDAO usersDAO;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ciao dal secondo runner");
		usersDAO.findById();
		usersDAO.save();
	}
}
