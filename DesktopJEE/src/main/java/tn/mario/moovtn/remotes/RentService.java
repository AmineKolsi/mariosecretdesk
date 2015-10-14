package tn.mario.moovtn.remotes;

 

import java.security.Timestamp;
import java.util.List;

import javax.ejb.Remote;

import tn.mario.moovtn.entities.Rent;
import tn.mario.moovtn.entities.TransportMean;

@Remote
public interface RentService   {
	 
	List<Rent> findAll();
	public Rent findById(int id);
	public void delete(Rent rent);
	List<Rent> findByMembers(int members);
	 
	
	 
	
	 

}
