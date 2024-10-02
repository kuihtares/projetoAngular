package io.github.kuihtares.projetoAngular;

import io.github.kuihtares.projetoAngular.model.entity.Cliente;
import io.github.kuihtares.projetoAngular.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetoAngularAplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoAngularAplication.class, args);
    }
}
