package riccardogulin.u5d2.entities;

public class Interviewer {
	private Student student;


	public Interviewer(Student student) { // Accoppiamento DEBOLE
		this.student = student;
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

	public void askQuestion() {
		System.out.println("Ciao " + this.student.getName() + ", per favore rispondimi alla seguente domanda...blablabla");
		this.student.answerQuestion();

	}
}
