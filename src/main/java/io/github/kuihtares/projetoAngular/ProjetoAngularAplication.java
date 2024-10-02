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

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository clienteRepository) {
        return args -> {
            Cliente cliente = Cliente.builder().nome("Cliente").cpf("00000000000").build();
            clienteRepository.save(cliente);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjetoAngularAplication.class, args);
    }
}
