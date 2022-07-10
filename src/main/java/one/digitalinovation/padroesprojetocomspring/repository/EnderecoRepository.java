package one.digitalinovation.padroesprojetocomspring.repository;

import one.digitalinovation.padroesprojetocomspring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco,String> {
}
