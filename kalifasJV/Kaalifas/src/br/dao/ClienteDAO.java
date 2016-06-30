package br.dao;
import br.entidades.Cliente;
import br.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO extends GenericDAO<Cliente>{

    public ClienteDAO() {
        super(Cliente.class);
    }
    
    public boolean autentica(String email, String senha){
  
        List<Cliente> lista = listar("email", email);
        if(lista.size()>0){
            Cliente cli = lista.get(0);
        if(cli.getSenha().equals(senha)){
                return true;
            }
        } 
        return false;
        
        
    }
    //Cadastro
    public boolean autenticaEmail(String email){
        
        List<Cliente> listal = listar("email", email);
          if(listal.size()>0){
            Cliente cli = listal.get(0);
            if(cli.getEmail().equals(email)){
                return true;
            }
        } 
        return false;
        
        
    }
   
        
        
    
        
    
  
    
}
