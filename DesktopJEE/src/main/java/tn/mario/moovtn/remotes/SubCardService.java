package tn.mario.moovtn.remotes;

import java.util.List;

import javax.ejb.Remote;

import tn.mario.moovtn.entities.SubscriptionCard;

@Remote
public interface SubCardService {
	void Add(SubscriptionCard subCard);
	void Delete(SubscriptionCard subCard);
	void Update(SubscriptionCard subCard);
	List<SubscriptionCard> FindAll();
	SubscriptionCard FindById(Integer id);


}
