package com.infotera.app.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="telefone")
public class Telefone {

    @Id    
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    @Column(name = "cliente_id")
    private Integer cliente_id;

    @Column(name = "nr_telefone")
    private String telefone;

    public Telefone(Integer id, Integer cliente_id, String telefone) {
        
        this.id = id;
        this.cliente_id = cliente_id;
        this.telefone = telefone;
        
        
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return cliente_id;
    }

    public void setClienteId(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
