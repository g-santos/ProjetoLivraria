package br.com.sebo;

import br.com.sebo.pojo.Livro;
import br.com.sebo.repository.LivroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeboApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeboApplication.class, args);
    }

    @Bean
    CommandLineRunner init(LivroRepository repository) {
        return args -> {

            Livro l1 = new Livro("A menina que roubava livros", "1991", "Fantasia");
            Livro l2 = new Livro("O guia do mochileiro das galáxias", "1995", "Fantasia");
            Livro l3 = new Livro("Spring Boot Book", "2017", "Tecnico");
            repository.save(l1);
            repository.save(l2);
            repository.save(l3);
        };
    }
}
