package br.com.kalifas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.kalifas.models.Cliente;

@Repository
public class ClienteDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Cliente cliente) {
		manager.merge(cliente);
	}
	
	public void delete(Cliente cliente) {
		manager.remove(cliente);
	}

	public List<Cliente> list() {
		return manager.createQuery(
				"select distinct(c) from Cliente c ",
				Cliente.class).getResultList();
	}
	
	public void remove(int id){
		Cliente c = buscarPorId(id);
		manager.remove(c);
	}
	
	public Cliente buscarPorId(int id){
		return manager.find(Cliente.class, id);
	}
}
