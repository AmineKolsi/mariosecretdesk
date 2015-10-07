package tn.mario.moovtn.implementations;

import java.sql.Timestamp;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.mario.moovtn.entities.TransportMean;
import tn.mario.moovtn.remotes.TransportMeanService;

@Stateless
public class TransportMeanImplementation implements TransportMeanService{
	
	@PersistenceContext(unitName="persist")
	EntityManager entityManager;

	@Override
	public void add(TransportMean transport) {
		entityManager.persist(transport);
		
	}

	@Override
	public void delete(TransportMean transport) {
		entityManager.remove(findById(transport.getId()));
		
	}

	@Override
	public void update(TransportMean transport) {
		entityManager.merge(transport);
		
	}

	@Override
	public List<TransportMean> findAll() {
		Query query = entityManager.createQuery("select tm from TransportMean tm");
		return query.getResultList();
	}

	@Override
	public TransportMean findById(int id) {
		
		return entityManager.find(TransportMean.class, id);
	}
	
	public Boolean isAvailable(Timestamp start, Timestamp end){
		
		return null;
		
	}

}
