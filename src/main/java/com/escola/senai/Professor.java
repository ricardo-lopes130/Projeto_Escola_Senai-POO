package com.escola.senai;

public class Professor extends Pessoa{

    //aumento professor

    private double salario;

    public Professor(String nome, String cpf, double salario, Endereco endereco) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
