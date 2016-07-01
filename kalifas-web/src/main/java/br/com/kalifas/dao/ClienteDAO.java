package br.com.kalifas.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import br.com.kalifas.models.Cliente;

@Repository
public class ClienteDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Cliente cliente) {
		manager.persist(cliente);
	}

//	public List<Product> list() {
//		return manager.createQuery(
//				"select distinct(p) from Product p join fetch p.prices",
//				Product.class).getResultList();
//	}
}
