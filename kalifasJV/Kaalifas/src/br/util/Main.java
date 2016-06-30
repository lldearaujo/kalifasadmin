/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.util;

import br.dao.ClienteDAO;
import br.entidades.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author JVICTOR
 */
public class Main {
    public static void main(String[] args) {
        Cliente jv = new Cliente();
        jv.setEmail("jv123");
        jv.setCep("4");
        jv.setEnderecoEntrega("Rua da apz");
        jv.setEnderecoMoradia("rua da apaaa");
        jv.setNome("JV");
        jv.setProximidades("clemir");
        jv.setTelefone("88");
        jv.setSenha("123");
        
        ClienteDAO a = new ClienteDAO();
        a.salvar(jv);
       
    }
}
