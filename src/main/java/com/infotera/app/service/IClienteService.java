package com.infotera.app.service;

import com.infotera.app.model.Cliente;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

import com.infotera.app.model.Telefone;


public interface IClienteService {

    Optional<Cliente> getClienteById(Integer id);

    ArrayList < Cliente >  getAllClientes();

    void updateCliente(Cliente cliente);

    void addCliente(String cliente, String email, String cep, String endereco, String bairro, String complemento, String cidade, Set<Telefone> telefones);

    void deleteCliente(Integer id);

    void saveCliente(Cliente cliente);
}

