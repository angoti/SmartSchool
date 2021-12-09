package br.edu.iftm.SmartSchool.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.edu.iftm.SmartSchool.model.Aluno;
import br.edu.iftm.SmartSchool.model.Usuario;

@Repository
public class AlunoRepository {
    
    @Autowired
    JdbcTemplate jdbc;
    
    public AlunoRepository(){

    }

    public List<Aluno> buscaTodosAlunos() {
        String consulta = "SELECT * FROM ALUNO;";
        return jdbc.query(consulta,
                (resultados, numeroDaLinha) -> new Usuario(
                    resultados.getString("nome"), 
                    resultados.getLong("id"), 
                    resultados.getString("cpf"), 
                    resultados.getString("dt_nascimento"), 
                    resultados.getString("email"), 
                    resultados.getString("pai"), 
                    resultados.getString("mae"),
                    resultados.getString("telefone"),
                    resultados.getString("endereco"),
                    resultados.getString("cidade"), 
                    resultados.getString("pais"), 
                    resultados.getString("cert_nascimento")));
    }

    public int gravaAluno(Aluno aluno){
        String consulta = "insert into cadastroaluno(nome, cpf, dt_nascimento, email, pai, mae, telefone, endereco, cidade, pais, cert_nascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbc.update(consulta, new Object[]{aluno.getNome(), aluno.getCpf(), aluno.getDt_nascimento(), aluno.getEmail(), aluno.getPai(), aluno.getMae(), aluno.getTelefone(), aluno.getEndereco(), aluno.getCidade(), aluno.getPais(), aluno.getCert_nascimento()});
    }

    public Integer excluirAluno(String cpf){
        String consulta = "delete from cadastroaluno where cpf = ?";
        return jdbc.update(consulta, cpf);
    }

    public Integer atualizarAluno(String cpf, Aluno aluno){
        String consulta = "update cadastroaluno set nome = ?, dt_nascimento = ?, email = ?, pai = ?, mae = ?, telefone = ?, endereco = ?, cidade = ?, pais = ?, cert_nascimento = ? where cpf = ?";
        //return jdbc.update(consulta, new Object[]{aluno.getNome(), aluno.getDt_nascimento(), aluno.getEmail(), aluno.getPai(), aluno.getMae(), aluno.getTelefone(), aluno.getEndereco(), aluno.getCidade(), aluno.getPais(), aluno.getCert_nascimento()}, aluno.getCpf());
        return jdbc.update(consulta, aluno.getNome(), aluno.getDt_nascimento(), aluno.getEmail(), aluno.getPai(), aluno.getMae(), aluno.getTelefone(), aluno.getEndereco(), aluno.getCidade(), aluno.getPais(), aluno.getCert_nascimento(), aluno.getCpf());
    }

    public Aluno buscaPorNome(String nome) {
        Aluno aluno = null;
        try {
            aluno = jdbc.queryForObject(
                "select * from cadastroaluno where nome = ?",
                (resultSet, rowNum) -> {
                    return new Aluno(resultSet.getString("nome"),
                    resultSet.getLong("id"), 
                    resultSet.getString("cpf"), 
                    resultSet.getString("dt_nascimento"), 
                    resultSet.getString("email"), 
                    resultSet.getString("pai"), 
                    resultSet.getString("mae"),
                    resultSet.getString("telefone"),
                    resultSet.getString("endereco"),
                    resultSet.getString("cidade"),  
                    resultSet.getString("pais"), 
                    resultSet.getString("cert_nascimento")); }, new Object[]{nome});
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return aluno;
    }
    public Aluno buscaPorCpf(String cpf) {
        Aluno aluno = null;
        try {
            aluno = jdbc.queryForObject(
                "select * from cadastroaluno where cpf = ?",
                (resultSet, rowNum) -> {
                    return new Aluno(resultSet.getString("nome"),
                    resultSet.getLong("id"), 
                    resultSet.getString("cpf"), 
                    resultSet.getString("dt_nascimento"), 
                    resultSet.getString("email"), 
                    resultSet.getString("pai"), 
                    resultSet.getString("mae"),
                    resultSet.getString("telefone"),
                    resultSet.getString("endereco"),
                    resultSet.getString("cidade"),  
                    resultSet.getString("pais"), 
                    resultSet.getString("cert_nascimento")); }, new Object[]{cpf});
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return aluno;
    }

    public int atualizaAluno(Aluno aluno){
        String consulta = "update cadastroaluno set nome = ? where id = ?";
        return jdbc.update(consulta, aluno.getNome(), aluno.getId());
    }
}
