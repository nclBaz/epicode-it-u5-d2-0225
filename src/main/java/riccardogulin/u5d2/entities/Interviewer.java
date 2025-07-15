package riccardogulin.u5d2.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Interviewer {
	// @Autowired // FIELD INJECTION
	// Mi effettua la DI senza il bisogno di costruttori o setter
	private Student student;
	private String name;
	private String surname;

	@Autowired// CONSTRUCTOR INJECTION (Qua l'annotazione è opzionale)
	public Interviewer(@Qualifier("aldo") Student student,
	                   @Qualifier("getName") String name,
	                   @Qualifier("getPGUsername") String surname) { // Accoppiamento DEBOLE
		this.student = student;
		this.name = name;
		this.surname = surname;
	}

/*
	public Interviewer() { // ACCOPPIAMENTO MOLTO FORTE! Non vogliamo che Interviewer lavori
		// esclusivamente con Backend Students di nome Aldo Baglio
		this.student = new BackendStudent("Aldo", "Baglio");
	}*/

	/*
	public Interviewer(BackendStudent backendStudent) { // ACCOPPIAMENTO FORTE. Se possibile meglio evitarlo.
		this.student = backendStudent;
	}*/

	/*
	@Autowired // OBBLIGATORIA sulla SETTER INJECTION
	// Setter Injection ci permette di avere il costruttore vuoto
	public void setStudent(Student student) {
		this.student = student;
	}*/

	public void askQuestion() {
		System.out.println("Ciao sono " + this.name + " " + this.surname);
		System.out.println("Ciao " + this.student.getName() + ", per favore rispondimi alla seguente domanda...blablabla");
		this.student.answerQuestion();

	}
}
