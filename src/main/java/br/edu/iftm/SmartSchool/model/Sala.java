package br.edu.iftm.SmartSchool.model;

public class Sala {
    private int cod_sala;
    private String turma;

    public Sala() {
    }

    public Sala(int cod_sala, String turma) {
        this.cod_sala = cod_sala;
        this.turma = turma;
    }

    public int getCod_sala() {
        return this.cod_sala;
    }

    public void setCod_sala(int cod_sala) {
        this.cod_sala = cod_sala;
    }

    public String getTurma() {
        return this.turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }    
}
