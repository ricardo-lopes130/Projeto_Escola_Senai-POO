package com.escola.senai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class SenaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);
		Scanner sc = new Scanner(System.in);

		System.out.println("__________* MENU ESCOLA SENAI *__________");
		System.out.println("\n");
		System.out.println("");
	}
}