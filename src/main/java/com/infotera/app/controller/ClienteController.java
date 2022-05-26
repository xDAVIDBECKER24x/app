package com.infotera.app.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.infotera.app.model.Cliente;
import com.infotera.app.service.IClienteService;
import java.util.List;

@Named
@ViewScoped
public class ClienteController {

    @Inject
    private IClienteService clienteService;

    private List<Cliente> clientes;
 
    private Cliente cliente = new Cliente();

    @PostConstruct
    public void init() {
        this.clientes = clienteService.getAllClientes();
    }

    public void deleteCliente(Cliente cliente) {
        clienteService.deleteCliente(cliente);
        clientes.remove(cliente);
    }
    
    public void updateCliente() {
        clienteService.updateCliente(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Update successful"));
    }

    public void addCliente() {
        clienteService.addCliente(cliente);
        this.clientes = clienteService.getAllClientes();
        this.cliente = new Cliente();
    }
}