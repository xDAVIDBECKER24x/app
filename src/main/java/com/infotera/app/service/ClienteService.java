package com.infotera.app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.infotera.app.model.Cliente;
import com.infotera.app.model.Telefone;
import com.infotera.app.repository.ClienteRepository;
import com.infotera.app.service.IClienteService;
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
    public void addCliente(String cliente, String email, String cep, String endereco, String bairro, String complemento, String cidade, Set<Telefone> telefones) {
        clienteRepository.save(new Cliente(cliente, email, cep, endereco, bairro, complemento, cidade, telefones ));
    }

    @Override
    public void deleteCliente(Integer id) {
        Optional < Cliente > cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            clienteRepository.delete(cliente.get());
        }
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

}