package io.github.kuihtares.projetoAngular.model.repository;

import io.github.kuihtares.projetoAngular.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
