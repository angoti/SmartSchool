package br.edu.iftm.SmartSchool.model;

import org.springframework.format.annotation.DateTimeFormat;

public class Aluno {
    private String nome;
    private Long id;
    private String cpf;
    @DateTimeFormat (pattern="dd/MM/yyyy")
    private String dt_nascimento;
    private String email;
    private String pai;
    private String mae;
    private String telefone;
    private String endereco;
    private String cidade;
    private String pais;
    private String cert_nascimento;

    public Aluno() {
    }

    public Aluno(String nome, Long id, String cpf, String dt_nascimento, String email, String pai, String mae, String telefone,
        String endereco, String cidade, String pais, String cert_nascimento) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.dt_nascimento = dt_nascimento;
        this.email = email;
        this.pai = pai;
        this.mae = mae;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
        this.pais = pais;
        this.cert_nascimento = cert_nascimento;
    }
    public Aluno(String nome, Long id, String cpf) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDt_nascimento() {
        return this.dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPai() {
        return this.pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return this.mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCert_nascimento() {
        return this.cert_nascimento;
    }

    public void setCert_nascimento(String cert_nascimento) {
        this.cert_nascimento = cert_nascimento;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
