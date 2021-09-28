package br.edu.iftm.SmartSchool;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

    @RequestMapping("/")
    String inicio(){
        return "index";
    }
    @RequestMapping("/login")
    String login(){
        return "login";
    }
    @RequestMapping("/aluno")
    String aluno(){
        return "pagAluno";
    }
    @RequestMapping("/ajustealuno")
    String ajuste(){
        return "ajuste";
    }
    @RequestMapping("/relatorio")
    String relatorio(){
        return "relatorioTurma";
    }
    @RequestMapping("/salas")
    String salas(){
        return "salas";
    }
    @RequestMapping("/respostasala")
    String respostasalas(){
        return "respostaSala";
    }
    @RequestMapping("/manteralunos")
    String manteralunos(){
        return "manterAlunos";
    }
    @RequestMapping("/manterprofessores")
    String manterprofessores(){
        return "manterProfessores";
    }
    @RequestMapping("/mantersala")
    String mantersala(){
        return "manterSalas";
    }
}