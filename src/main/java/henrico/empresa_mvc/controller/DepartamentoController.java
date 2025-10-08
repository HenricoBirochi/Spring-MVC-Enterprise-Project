package henrico.empresa_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import henrico.empresa_mvc.model.Departamento;
import henrico.empresa_mvc.service.interfaces.DepartamentoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @GetMapping("/cadastrar")// Quando vc coloca um objeto no parametro do metodo, ele vai para a view (pro template)
    public String cadastrar(Departamento departamento) {
        return "departamento/cadastro";
    }

    @GetMapping("/listar")// Nesse caso voce esta mandando um objeto do tipo 'ModelMap' o qual voce pode usar para armazenar varios objetos
    public String listar(ModelMap model) { //e escolher um nome de acesso desses objetos para o template
        model.addAttribute("departamentos", service.buscarTodos());
        return "departamento/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Departamento departamento) {
        service.salvar(departamento);
        return "redirect:/departamentos/cadastrar";
    }

}
