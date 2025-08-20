package br.com.literalura.controller;

import br.com.literalura.entity.Livro;
import br.com.literalura.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/todos")
    public List<Livro> listarTodos() {
        return livroService.listarTodos();
    }

    @GetMapping("/porIdioma")
    public List<Livro> listarPorIdioma(@RequestParam String idioma) {
        return livroService.listarPorIdioma(idioma);
    }

    @GetMapping("/buscar")
    public List<Livro> buscarPorTitulo(@RequestParam String titulo) {
        return livroService.buscarPorTitulo(titulo);
    }
}
