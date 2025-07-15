package riccardogulin.u5d2.dao;

import org.springframework.stereotype.Component;

@Component
public class UsersDAO {
	public void save() {
		System.out.println("User salvato");
	}

	public void findById() {
		System.out.println("User trovato");
	}
}
