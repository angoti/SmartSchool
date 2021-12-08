package br.edu.iftm.SmartSchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartSchoolApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartSchoolApplication.class, args);
	}

	/*@Override
    public void run(String... args) throws Exception {
		jdbcTemplate.execute("CREATE TABLE cadastroAluno(id SERIAL, nome VARCHAR(255), cpf VARCHAR(255), dt_nascimento VARCHAR(255), email VARCHAR(255), pai VARCHAR(255), mae VARCHAR(255), telefone VARCHAR(255), endereco VARCHAR(255), cidade VARCHAR(255), pais VARCHAR(255), cert_nascimento VARCHAR(255))");	
		
		jdbcTemplate.update("INSERT INTO cadastroAluno(nome, cpf, dt_nascimento, email, pai, mae, telefone, endereco, cidade, pais, cert_nascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "Edson Angoti Júnior", "55555555555", "2021-03-01", "ssdisjd@gmail.com", "João", "Maria", "99999-333", "Rua x, 1160", "São Paulo", "Brasil", "25124ssd");
		
		jdbcTemplate.update("INSERT INTO cadastroAluno(nome, cpf, dt_nascimento, email, pai, mae, telefone, endereco, cidade, pais, cert_nascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "Júnior Alow", "55555555559", "2021-03-01", "ssdisjd@gmail.com", "João", "Maria", "99999-333", "Rua x, 1160", "São Paulo", "Brasil", "25124ssd");
	}*/
}
