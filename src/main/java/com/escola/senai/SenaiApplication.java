package com.escola.senai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SenaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);
	
		Menu.menu();

		// Endereco endereco1 = new Endereco("Rua General Rondon", 320, "25620-343", "A340");
		// Endereco endereco2 = new Endereco("Praca Rui Barbosa", "217", "25404 050", "B102");
		// Pessoa pessoa1 = new Pessoa("Fernando", "123.456.789-10", endereco1);
		// Professor professor1 = new Professor("Arthur", "123.456.987-10", 8000.00, endereco1);
		// Aluno aluno1 = new Aluno("Delmir", "123.456.789-10", endereco1);
		// Aluno aluno2 = new Aluno("Ricardo", "123.654.879-20", endereco2);
		// Disciplina disciplina1 = new Disciplina("Matematica", Turno.NOITE, professor1);
		// Avaliacao avaliacao1 = new Avaliacao(10, 9.6, aluno1, disciplina1, professor1);
		// Avaliacao avaliacao2 = new Avaliacao(6, 5.6, aluno2, disciplina1, professor1);	

		// System.out.println(avaliacao2);
		// System.out.println("----------------------------------");
		// System.out.println(disciplina1);

	}
}