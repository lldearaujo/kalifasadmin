package br.dao;
import br.entidades.Usuario;
import br.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO extends GenericDAO<Usuario>{

    public UsuarioDAO() {
        super(Usuario.class);
    }
    
 public boolean autentica(String login, String senha){
//        AdminDAO aDAO = new AdminDAO();
        List<Usuario> lista = listar("login", login);
        if(lista.size()>0){
            Usuario usu = lista.get(0);
            if(usu.getSenha().equals(senha)){
                return true;
            }
        } 
        return false;
        
        
    }
    //Cadastro
    public boolean autenticaLogin(String login){
        
        List<Usuario> listal = listar("login", login);
          if(listal.size()>0){
            Usuario admin = listal.get(0);
            if(admin.getLogin().equals(login)){
                return true;
            }
        } 
        return false;
        
        
    }





}