package br.edu.iftm.SmartSchool.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.iftm.SmartSchool.helper.Utils;
import br.edu.iftm.SmartSchool.model.Aluno;
import br.edu.iftm.SmartSchool.model.Usuario;
import br.edu.iftm.SmartSchool.repository.AlunoRepository;

@Controller
public class AdminAtualizaAlunoController {

    @Autowired
    AlunoRepository repo;

    @GetMapping(value = "cadastroaluno")
    String cadastroAluno(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "cadastroAluno";
    }

    @PostMapping(value = "cadastroaluno")
    public String gravarAluno(@Valid Aluno aluno, BindingResult bindingResult, RedirectAttributes ra) {
        Aluno a = new Aluno();
        if (bindingResult.hasErrors()) {
            return "cadastroaluno";
        }

        String validar = aluno.getUsuario().getLogin();
        String validar2 = aluno.getUsuario().getCpf();

        Pattern pattern = Pattern.compile("@", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(validar);
        boolean match = matcher.find();

        if (validar2.length() != 11) {
            ra.addFlashAttribute("dangermensage", "O CPF deve possuir exatamente 11 digitos, apenas números!");
            return "redirect:/cadastroaluno";
        } else if(match != true || validar.length() > 10){
            ra.addFlashAttribute("dangermensage", "O Login deve possuir @ e no máximo 10 caracteres!");
            return "redirect:/cadastroaluno";
        }else {

            try {

                a = repo.buscaPorLogin(validar);
                a = repo.buscaPorCpf(validar2);
            } catch (EmptyResultDataAccessException e) {
                System.out.println("alow");
                return null;
            }

            if (repo.buscaPorLogin(validar) != null || a != null) {
                ra.addFlashAttribute("dangermensage", "Login já esta sendo utilizado!");
                return "redirect:/cadastroaluno";
            }

            repo.gravaAluno(aluno);
            ra.addFlashAttribute("sucessmensage", "Aluno cadastrado com sucesso!");
            return "redirect:/cadastroaluno";
        }

    }

    @RequestMapping(value = "/manteralunos", method = RequestMethod.GET)
    public String buscaDadosAluno(@RequestParam(value = "identidadeAluno", required = false) String identidadeAluno,
            Model model) {
        Aluno aluno = new Aluno();
        if (identidadeAluno == null || identidadeAluno.isEmpty()) {
            model.addAttribute("aluno", aluno);
            return "manterAlunos";
        }
        identidadeAluno = identidadeAluno.replace(".", "").replace("-", "");
        // Verifica se e CPF ou NOME//
        if (Utils.isLong(identidadeAluno)) {
            // Validação deu CPF na busca//
            if (identidadeAluno.length() < 11 || identidadeAluno.length() > 11) {
                model.addAttribute("aluno", aluno);
                return "manterAlunos";
            }
            Aluno a = repo.buscaPorCpf(identidadeAluno);
            if (a != null) {
                aluno = a;
            }
        } else {
            // Validação deu nome na busca//
            Aluno a = repo.buscaPorLogin(identidadeAluno);
            if (a != null) {
                aluno = a;
            }
        }
        model.addAttribute("aluno", aluno);
        return "manterAlunos";
    }

    @RequestMapping(value = "/manteralunos", method = RequestMethod.POST)
    public String atualizarAluno(@RequestParam(value = "usuario.cpf", required = true) String cpf, Aluno aluno,
            Model model) {
        Integer result = repo.atualizarAluno(cpf, aluno);
        if (result != null && result > 0) {
            model.addAttribute("sucessmensage", "Aluno atualizado com sucesso!");
        }
        model.addAttribute("alunoModel", new Aluno());
        return "manterAlunos";
    }

    @RequestMapping(value = "/manteralunos", method = RequestMethod.DELETE)
    public String excluirAluno(@RequestParam(value = "login", required = true) String login, Model model,
            RedirectAttributes ra) {
        Integer result = repo.excluirAluno(login);

        if (result != null && result > 0) {
            ra.addFlashAttribute("sucessmensage", "Aluno excluido com sucesso!");
        }
        return "redirect:/manteralunos";
    }
}
