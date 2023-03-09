package br.com.fiap.healthydelight.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.healthydelight.models.Pessoa;

//  Controller é a primeira camada do servidor
//  Sua função é ser uma camada intermediária entre a camada de apresentação (View) e a camada de negócios (Model). Deste modo, toda 
//  requisição criada pelo usuário deve passar pelo controller, e este então se comunica com o model.

//@Controller
@RestController
public class PessoaController {
    //  @RequestMapping("/api/despesas") //Mapeia URLs
    //  Por utilizar o RestController não é mais necessário essa anotação
    //  @ResponseBody //Retorna o corpo da resposta

    @GetMapping("/api/pessoa")
    public String mostraDados() {
        Pessoa pessoa = new Pessoa(9021, "Pedro", 100, 175, 22, 19, "Masculino");

        return String.format("{id: %s; Nome: %s; Peso: %s kg; Altura: %s cm; Imc: %s; Idade: %s; Sexo: %s}", 
        pessoa.getId_pessoa(), pessoa.getNome(), pessoa.getPeso(), pessoa.getAltura(), pessoa.getImc(), pessoa.getIdade(), pessoa.getSexo());
    }
}
