package one.digitalinovation.padroesprojetocomspring.repository;

import one.digitalinovation.padroesprojetocomspring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
