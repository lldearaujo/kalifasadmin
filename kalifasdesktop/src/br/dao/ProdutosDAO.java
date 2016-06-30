package br.dao;
import br.entidades.Produtos;
import br.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDAO extends GenericDAO<Produtos>{

    public ProdutosDAO() {
        super(Produtos.class);
    }
    
}