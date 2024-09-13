package com.escola.senai;

public class Aluno extends Pessoa{

    public static int contadorMatricula=1;
    private String matricula;
    
    Aluno(){}

    public Aluno(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
        this.matricula = (contadorMatricula+".24/2");
        contadorMatricula++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
