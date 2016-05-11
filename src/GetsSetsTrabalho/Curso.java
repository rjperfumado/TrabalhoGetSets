package GetsSetsTrabalho;

public class Curso extends Disciplina {
	
	String nome;
	int carga;
	private Disciplina disciplinas;
	

	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCarga() {
		return this.carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	public Disciplina getDisciplinas() {
		return this.disciplinas;
	}


	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}


	public void definecarga(int carga) {
		// TODO Auto-generated constructor stub
	}

}
