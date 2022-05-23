package com.infotera.app.service;

import com.infotera.app.model.Cliente;
import java.util.List;
import com.infotera.app.model.Telefone;


public interface IClienteService {

    < CLiente > void getClienteById(Integer id);

    void updateCliente(Cliente cliente);

    void addCliente(String cliente, String email, String cep, String endereco, String bairro, String complemento, String cidade, List<Telefone> telefones);

    void deleteCliente(Integer id);

    void saveCliente(Cliente cliente);
}

