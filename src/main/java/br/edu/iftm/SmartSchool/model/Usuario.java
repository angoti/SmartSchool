package br.edu.iftm.SmartSchool.model;

import org.springframework.format.annotation.DateTimeFormat;

public class Usuario {
    private String login;
    private String senha;
    private int rg;
    private String telefone;
    @DateTimeFormat (pattern="dd/MM/yyyy")
    private String data_nasc;
    private String email;
    private String nome;
    private int cpf;
    private String endereco;

    public Usuario() {
    }

    public Usuario(String login, String senha, int rg, String telefone, String data_nasc, String email, String nome, int cpf, String endereco) {
        this.login = login;
        this.senha = senha;
        this.rg = rg;
        this.telefone = telefone;
        this.data_nasc = data_nasc;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getRg() {
        return this.rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_nasc() {
        return this.data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
