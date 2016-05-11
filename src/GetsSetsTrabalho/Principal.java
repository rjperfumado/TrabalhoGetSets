package GetsSetsTrabalho;

import java.util.Scanner;

public class Principal {

	static Scanner digita = new Scanner(System.in);

	public static void main(String[] args) {

		CadAluno();
		CadAtendimento();
		CadCurso();
		CadDisciplina();
		CadProfessor();

	}

	public static void CadAluno() {

		Aluno aluno = new Aluno();

		System.out.printf("\nInforme o nome do aluno: ");
		aluno.setNome(digita.nextLine());

		System.out.printf("Aluno cadastrado: " + aluno.getNome());

	}

	public static void CadAtendimento() {

		Atendimento atende = new Atendimento();

		System.out.printf("\nInforme o Setor do funcionário: ");
		atende.setSetor(digita.nextLine());

		System.out.println("O Setor informado: " + atende.getSetor());

	}

	public static void CadCurso() {

		Curso curso = new Curso();

		System.out.printf("\nInforme o nome do Curso: ");
		curso.setNome(digita.nextLine());

		System.out.println("O nome do curso informado: " + curso.getNome());

	}

	public static void CadDisciplina() {

		Disciplina disciplina = new Disciplina();

		System.out.printf("\nInforme a disciplina cursada: ");
		disciplina.setNome(digita.nextLine());

		System.out.println("A disciplina informada foi: " + disciplina.getNome());

	}

	public static void CadProfessor() {

		Professor professor = new Professor();

		System.out.printf("Informe o CPF do professor: ");
		professor.setCpf(digita.nextLine());

		System.out.println("O CPF informado foi: " + professor.getCpf());

	}

}
