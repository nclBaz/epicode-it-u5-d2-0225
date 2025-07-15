package riccardogulin.u5d2.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Interviewer {
	@Autowired // FIELD INJECTION
	// Mi effettua la DI senza il bisogno di costruttori o setter
	private Student student;

	/* @Autowired CONSTRUCTOR INJECTION (Qua l'annotazione è opzionale)
	public Interviewer(Student student) { // Accoppiamento DEBOLE
		this.student = student;
	} */

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
		System.out.println("Ciao " + this.student.getName() + ", per favore rispondimi alla seguente domanda...blablabla");
		this.student.answerQuestion();

	}
}
