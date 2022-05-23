package com.infotera.app.controller;


import java.text.SimpleDateFormat;
import java.util.Date;



import com.infotera.app.model.Cliente;
import com.infotera.app.service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @RequestMapping(value = "/list-clientes", method = RequestMethod.GET)
    public String showClientes(ModelMap model) {
        model.put("clientes", clienteService.getAll());
        return "list-clientes";
    }

    @RequestMapping(value = "/add-cliente", method = RequestMethod.GET)
    public String showAddClientesPage(ModelMap model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente";
    }

    @RequestMapping(value = "/delete-clientes", method = RequestMethod.GET)
    public String deleteCliente(@RequestParam long id) {
        clienteService.deleteCliente(id);
        return "redirect:/list-clientes";
    }

    @RequestMapping(value = "/update-clientes", method = RequestMethod.GET)
    public String showUpdateClientePage(@RequestParam long id, ModelMap model) {
        Cliente cliente = clienteService.getClienteById(id).get();
        model.put("cliente", cliente);
        return "cliente";
    }

    @RequestMapping(value = "/update-clientes", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Validated   Cliente todo, BindingResult result) {

        if (result.hasErrors()) {
            return "todo";
        }

        clienteService.updateTodo(cliente);
        return "redirect:/list-clientes";
    }

    @RequestMapping(value = "/add-cliente", method = RequestMethod.POST)
    public String addCliente(ModelMap model, @Validated Cliente todo, BindingResult result) {

        if (result.hasErrors()) {
            return "cliente";
        }

        clienteService.saveClientes(cliente);
        return "redirect:/list-clientes";
    }
}