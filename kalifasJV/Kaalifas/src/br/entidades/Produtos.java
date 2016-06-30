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
public class Produtos {
    
    @Id
    @GeneratedValue
    private int codigoProdutos;
    
    @Column
    private String categoria;
    
    @Column
    private double preco;
    
    @Column
    private int estoque;
    
    @Column
    private String descricao;
    
    @Column
    private String marca;

   
    
    public int getCodigoProdutos() {
        return codigoProdutos;
    }

    public void setCodigoProdutos(int codigoProdutos) {
        this.codigoProdutos = codigoProdutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
}
