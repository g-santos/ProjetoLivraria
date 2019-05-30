package br.com.sebo.controller;

import br.com.sebo.pojo.Livro;
import br.com.sebo.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    public LivroRepository repository;

    @PostMapping("livros")
    public Livro salvar(@RequestBody Livro livro){
        return repository.save(livro);
    }

    @PutMapping("livros")
    public Livro atualizar(@RequestBody Livro livro){
        return repository.save(livro);
    }

    @DeleteMapping("livros/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @DeleteMapping("livros")
    public void excluir(@RequestBody Livro livro){
        repository.delete(livro);
    }

    @GetMapping("livros")
    public List<Livro> getLivros(){
        return repository.findAll();
    }

    @GetMapping("livros/{id}")
    public Optional<Livro> getLivro(@PathVariable Long id){
        return repository.findById(id);
    }

    @GetMapping("livros/{ano}")
    public List<Livro> livroList(@PathVariable String ano){
        return repository.findAll;
    }

}

}







