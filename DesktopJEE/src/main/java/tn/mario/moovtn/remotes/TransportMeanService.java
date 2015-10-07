package tn.mario.moovtn.remotes;


import java.util.List;

import javax.ejb.Remote;

import tn.mario.moovtn.entities.TransportMean;

@Remote
public interface TransportMeanService {
	
	public void add(TransportMean transport);
	public void delete(TransportMean transport);
	public void update(TransportMean transport);
	public List<TransportMean> findAll();
	public TransportMean findById(int id);
	
}
