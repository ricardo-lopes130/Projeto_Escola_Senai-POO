package com.escola.senai;

public class Disciplina {
    
    // fazer enum turno
    private String nome;
    private String turno;
    private Professor professor;

    public Disciplina(String nome, String turno, Professor professor) {
        this.nome = nome;
        this.turno = turno;
        this.professor = professor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
