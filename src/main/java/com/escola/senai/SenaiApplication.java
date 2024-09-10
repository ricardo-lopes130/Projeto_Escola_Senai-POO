package com.escola.senai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SenaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);

		Pessoa pessoa1 = new Pessoa("Jou a quim", "123.456.789-10");
		Professor professor1 = new Professor("Arthur", "123.456.987-10", 8000.00);
		Aluno aluno1 = new Aluno("Delmir", "123.456.789-10", "1234-0");
		Disciplina disciplina1 = new Disciplina("Matematica", "Noite", professor1);
		Avaliacao avaliacao1 = new Avaliacao(10, 9.6, aluno1, disciplina1, professor1);

		System.out.println(avaliacao1.toString());

	}

}
