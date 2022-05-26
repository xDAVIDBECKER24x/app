package com.infotera.app.service;

import com.infotera.app.model.Cliente;

import java.util.ArrayList;
import java.util.Optional;


public interface IClienteService {

    Optional<Cliente> getClienteById(Integer id);

    ArrayList < Cliente >  getAllClientes();

    void updateCliente(Cliente cliente);

    void addCliente(Cliente cliente);

    void deleteCliente(Cliente cliente);

    void saveCliente(Cliente cliente);
}

