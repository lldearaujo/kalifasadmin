package br.dao;

import java.util.List;

public interface DAO<T> {
    
    public boolean salvar(T t);
    public boolean editar(T t);
    public boolean excluir(T t);
    public List<T> listar();
    public List<T> listar (String campo, Object valor);
    
}