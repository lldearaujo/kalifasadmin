package br.dao;
import br.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Hibernate;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class GenericDAO<T> implements DAO<T>{
    private Session sessao;
    private Transaction transacao;

    @Override
    public boolean salvar(T t) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(t);
            transacao.commit();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        } finally{
            sessao.close();
        }
        return true;
    }
    @Override
    public boolean editar(T t) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.update(t);
            transacao.commit();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        } finally{
            sessao.close();
        }
        return true;
    }
    @Override
    public boolean excluir(T t) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(t);
            transacao.commit();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        } finally{
            sessao.close();
        }
        return true;
    }
    
    private Class classe;
    
    public GenericDAO(Class classe){
        this.classe = classe;
    }
    
    @Override
    public List<T> listar() {
        List<T> lista = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            lista = sessao.createCriteria(classe).list();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return lista;
        } finally{
            sessao.close();
        }
        return lista;
    }
    
    @Override
    public List<T> listar(String campo, Object valor) {
        List<T> lista = null;
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            lista = sessao.createCriteria(classe).add(Restrictions.eq(campo, valor)).list();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return lista;
        } finally{
            sessao.close();
        }
        return lista;
    }

}
