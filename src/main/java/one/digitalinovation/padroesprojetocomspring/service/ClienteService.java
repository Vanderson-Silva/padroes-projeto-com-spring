package one.digitalinovation.padroesprojetocomspring.service;

import one.digitalinovation.padroesprojetocomspring.model.Cliente;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
