package br.edu.iftm.SmartSchool.model;

import org.springframework.format.annotation.DateTimeFormat;

public class Aluno {
    private String matricula;
    private String nome_mae;
    private String nome_pai;
    @DateTimeFormat (pattern="dd/MM/yyyy")
    private String data_matricula;
    private int tel_responsavel;
    private String cod_sala;
    private Usuario login;

    public Aluno() {
    }

    public Aluno(String matricula, String nome_mae, String nome_pai, String data_matricula, int tel_responsavel, String cod_sala, Usuario login) {
        this.matricula = matricula;
        this.nome_mae = nome_mae;
        this.nome_pai = nome_pai;
        this.data_matricula = data_matricula;
        this.tel_responsavel = tel_responsavel;
        this.cod_sala = cod_sala;
        this.login = login;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome_mae() {
        return this.nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getNome_pai() {
        return this.nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getData_matricula() {
        return this.data_matricula;
    }

    public void setData_matricula(String data_matricula) {
        this.data_matricula = data_matricula;
    }

    public int getTel_responsavel() {
        return this.tel_responsavel;
    }

    public void setTel_responsavel(int tel_responsavel) {
        this.tel_responsavel = tel_responsavel;
    }

    public String getCod_sala() {
        return this.cod_sala;
    }

    public void setCod_sala(String cod_sala) {
        this.cod_sala = cod_sala;
    }

    public Usuario getLogin() {
        return this.login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }
    
}
