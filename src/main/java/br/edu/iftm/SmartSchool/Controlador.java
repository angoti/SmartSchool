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
}