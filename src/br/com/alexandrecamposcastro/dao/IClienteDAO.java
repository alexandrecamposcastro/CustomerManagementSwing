package br.com.alexandrecamposcastro.dao;

import java.util.Collection;

import br.com.alexandrecamposcastro.domain.Cliente;


public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
