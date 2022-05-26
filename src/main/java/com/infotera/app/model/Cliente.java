package com.infotera.app.model;


import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="cliente")
public class Cliente {

    @Id    
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nm_cliente")
    private String cliente;
    
    @Column(name = "nm_email")
    private String email;
    
    @Column(name = "nr_cep")
    private String cep;
    
    @Column(name = "nm_endereco")
    private String endereco;
    
    @Column(name = "nm_bairro")
    private String bairro;
    
    @Column(name = "nm_complemento")
    private String complemento;
    
    @Column(name = "nm_cidade")
    private String cidade;


    @OneToMany(mappedBy="telefone")
    @JoinColumn(name="cliente_id")
    private Set<Telefone> telefones;
	
    public Cliente() {
        super();
    }

    public Cliente(String cliente, String email, String cep, String endereco, String bairro, String complemento, String cidade, Set<Telefone> telefones) {
        
        this.cliente = cliente;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.telefones = telefones;

        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
        
    }

}
