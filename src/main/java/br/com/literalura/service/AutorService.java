package br.com.literalura.service;

import br.com.literalura.entity.Autor;
import br.com.literalura.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> listarTodos() {
        return autorRepository.findAll();
    }

    public List<Autor> listarAutoresVivosNoAno(Integer ano) {
        return autorRepository.findByAnoNascimentoLessThanEqualAndAnoFalecimentoGreaterThanEqual(ano, ano);
    }

    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }
}
