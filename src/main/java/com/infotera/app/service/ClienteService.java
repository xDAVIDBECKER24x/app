package com.infotera.app.service;

import java.util.ArrayList;
import java.util.Optional;

import com.infotera.app.model.Cliente;
import com.infotera.app.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService implements IClienteService {


    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public ArrayList < Cliente > getAllClientes() {
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Optional < Cliente > getClienteById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void addCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        Optional<Cliente> cliente_id = clienteRepository.findById(cliente.getId());
        if (cliente_id.isPresent()) {
            clienteRepository.delete(cliente);
        }
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

}