package br.edu.iftm.SmartSchool.model;

public class Professor {
    private Integer cod_professor;
    private String usuario_login;
    private Usuario usuario;

    public Professor() {
    }

    public Professor(Usuario usuario, Integer cod_professor, String usuario_login) {
        this.cod_professor = cod_professor;
        this.usuario_login = usuario_login;
        this.usuario = usuario;
    }

    public Integer getCod_professor() {
        return this.cod_professor;
    }

    public void setCod_professor(Integer cod_professor) {
        this.cod_professor = cod_professor;
    }

    public String getUsuario_login() {
        return this.usuario_login;
    }

    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setLogin(Usuario usuario) {
        this.usuario = usuario;
    }    
}
