package com.escola.senai;

public class Disciplina {

    private String nomeDisciplina;
    private Turno turno;
    private Professor professor;

    public Disciplina(String nomeDisciplina, Turno turno, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.turno = turno;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nomeDisciplina + ". Turno: " + turno + ". Professor: " + professor.getNome() + ".";
    }
}
