package br.edu.iftm.SmartSchool.model;

public class Professor {
    private int cod_professor;
    private Usuario login;

    public Professor() {
    }

    public Professor(int cod_professor, Usuario login) {
        this.cod_professor = cod_professor;
        this.login = login;
    }

    public int getCod_professor() {
        return this.cod_professor;
    }

    public void setCod_professor(int cod_professor) {
        this.cod_professor = cod_professor;
    }

    public Usuario getLogin() {
        return this.login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }
}



