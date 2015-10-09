package tn.mario.moovtn.implementations;

import java.util.List;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.mario.moovtn.entities.SubscriptionCard;
import tn.mario.moovtn.remotes.SubCardService;

@Stateless
public class SubCardImplementation implements SubCardService {

	@PersistenceContext(unitName="persist")
	EntityManager em;
	
	@Override
	public void Add(SubscriptionCard subCard) {
		em.persist(subCard);
	}		
	
	@Override
	public void Delete(SubscriptionCard subCard) {
		em.remove(em.merge(subCard));
		
	}

	@Override
	public void Update(SubscriptionCard subCard) {
		em.merge(subCard);
		
	}

	@Override
	public List<SubscriptionCard> FindAll() {
		Query q = em.createQuery("select sc from SubscriptionCard sc");
		return q.getResultList() ;
	
	}

	@Override
	public SubscriptionCard FindById(Integer id) {
		
		return em.find(SubscriptionCard.class, id);
	}

}
