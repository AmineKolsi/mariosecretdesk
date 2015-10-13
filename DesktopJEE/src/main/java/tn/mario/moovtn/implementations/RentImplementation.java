package tn.mario.moovtn.implementations;

import java.security.Timestamp;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.mario.moovtn.entities.Rent;
import tn.mario.moovtn.entities.TransportMean;
import tn.mario.moovtn.remotes.RentService;

@Stateless
public class RentImplementation implements RentService {
	@PersistenceContext(unitName="persist")
	EntityManager entityManager;
	
	 

	@Override
	public List<Rent> findAll() {
		 
		Query query= entityManager.createQuery("SELECT r FROM Rent r ");
		return  query.getResultList(); 
	}
	
	@Override
	public void delete(Rent rent) {
		entityManager.remove(findById(rent.getId()));
		
	}
	@Override
	public Rent findById(int id) {
		
		return entityManager.find(Rent.class, id);
	}

	@Override
	public List<Rent>  findByMembers(int members) {
		Query query= entityManager.createQuery(" Select r from Rent r where r.rentEnd=:sysdate");
		query.setParameter("p1", members);
		return  query.getResultList(); 
		 
	}


 
 

}
