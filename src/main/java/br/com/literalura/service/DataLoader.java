package br.com.literalura.service;

import br.com.literalura.entity.Autor;
import br.com.literalura.entity.Livro;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final LivroService livroService;
    private final AutorService autorService;

    public DataLoader(LivroService livroService, AutorService autorService) {
        this.livroService = livroService;
        this.autorService = autorService;
    }

    @Override
    public void run(String... args) {
        Autor autor1 = new Autor("Machado de Assis", 1839, 1908);
        Autor autor2 = new Autor("José de Alencar", 1829, 1877);

        Livro livro1 = new Livro("Dom Casmurro", "Português", 5000, autor1);
        Livro livro2 = new Livro("Iracema", "Português", 3000, autor2);

        autorService.salvar(autor1);
        autorService.salvar(autor2);

        livroService.salvar(livro1);
        livroService.salvar(livro2);
    }
}
