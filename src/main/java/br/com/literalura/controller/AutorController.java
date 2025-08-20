package br.com.literalura.controller;

import br.com.literalura.entity.Autor;
import br.com.literalura.service.AutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping("/todos")
    public List<Autor> listarTodos() {
        return autorService.listarTodos();
    }

    @GetMapping("/vivos")
    public List<Autor> listarAutoresVivos(@RequestParam Integer ano) {
        return autorService.listarAutoresVivosNoAno(ano);
    }
}
