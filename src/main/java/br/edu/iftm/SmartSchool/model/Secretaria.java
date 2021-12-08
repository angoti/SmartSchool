package br.edu.iftm.SmartSchool.model;

public class Secretaria {
    private int cod_adm;
    private Usuario login;

    public Secretaria() {
    }

    public Secretaria(int cod_adm, Usuario login) {
        this.cod_adm = cod_adm;
        this.login = login;
    }

    public int getCod_adm() {
        return this.cod_adm;
    }

    public void setCod_adm(int cod_adm) {
        this.cod_adm = cod_adm;
    }

    public Usuario getLogin() {
        return this.login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }
}
