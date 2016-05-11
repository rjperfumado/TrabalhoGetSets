package GetsSetsTrabalho;

public class Professor extends Disciplina{

	String nome;
	int matricula;
	String cpf;
	private Disciplina disciplina;
	
	
	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return this.matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getCpf() {
		return this.cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Disciplina getDisciplina() {
		return this.disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public void cpf(String cpf) {
		// TODO Auto-generated constructor stub
	}

}
