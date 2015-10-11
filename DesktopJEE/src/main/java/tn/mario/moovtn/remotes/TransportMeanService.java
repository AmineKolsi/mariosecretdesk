package tn.mario.moovtn.remotes;


import java.util.List;

import javax.ejb.Remote;

import tn.mario.moovtn.entities.TransportMean;

@Remote
public interface TransportMeanService {
	
	public boolean add(TransportMean transport);
	public void delete(TransportMean transport);
	public void update(TransportMean transport);
	public List<TransportMean> findAll();
	TransportMean findBySerial(String serial);
	
}
