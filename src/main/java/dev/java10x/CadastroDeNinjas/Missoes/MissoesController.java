package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET - Mandar uma requisisao para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissao() {
        return "Missoes Listadas com sucesso";
    }

    // POST - Mandar uma requisisao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao Criada com sucesso";
    }

    // PUT - Mandar uma requisisao para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao Alterada com sucesso";
    }

    // DELETE - Mandar uma requisisao para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao Deletada com sucesso";
    }
}
