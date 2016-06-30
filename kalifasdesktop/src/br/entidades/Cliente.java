/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.entidades;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author JVICTOR
 */
@Entity
public class Cliente {
   
    @Id
    @GeneratedValue
    private int codigo;
    
    private String email;
    private String senha;
    
    @Column(length = 100, nullable = false)
    private String nome;

   
    
    @Column(length = 100, nullable = false)
    private String enderecoMoradia;
    
    @Column(length = 100, nullable = true)
    private String enderecoEntrega;
    
    @Column(length = 50, nullable = false)
    private String telefone;
    
    @Column(length = 9, nullable = true)
    private String cep;
    
    @Column(length = 200, nullable = true)
    private String proximidades;
    
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAniversario;

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoMoradia() {
        return enderecoMoradia;
    }

    public void setEnderecoMoradia(String enderecoMoradia) {
        this.enderecoMoradia = enderecoMoradia;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getProximidades() {
        return proximidades;
    }

    public void setProximidades(String proximidades) {
        this.proximidades = proximidades;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
