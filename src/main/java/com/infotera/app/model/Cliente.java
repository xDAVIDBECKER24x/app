package com.infotera.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name="cliente")
class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cliente;
    private String email;
    private String cep;
    private String endereco;
    private String bairro;
    private String complemento;
    private String cidade;


    @OneToMany(mappedBy="telefone")
    private Set<Telefones> telefones;
	

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
