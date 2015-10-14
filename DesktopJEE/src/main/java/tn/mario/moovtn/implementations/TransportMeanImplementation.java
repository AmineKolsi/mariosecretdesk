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
	public boolean add(TransportMean transport) {
		if(findBySerial(transport.getSerial())==null){
			entityManager.persist(transport);
			return true;
		}
		return false;
		
		
	}

	@Override
	public void delete(TransportMean transport) {
		entityManager.remove(findBySerial(transport.getSerial()));
		
	}

	@Override
	public void update(TransportMean transport) {
		entityManager.merge(transport);
		
	}

	@Override
	public List<TransportMean> findAll() {
		try {
			Query query = entityManager.createQuery("select tm from TransportMean tm");
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public TransportMean findBySerial(String serial) {
		
		try {
			return entityManager.find(TransportMean.class, serial);
		} catch (Exception e) {
			return null;
		}
	}
	
	public Boolean isAvailable(Timestamp start, Timestamp end){
		
		return null;
		
	}

	

}
