package tn.mario.moovtn.remotes;

import java.util.List;

import javax.ejb.Remote;

import tn.mario.moovtn.entities.Station;

@Remote
public interface StationRemote {
	public void add(Station station);
	public List<Station> findAll();
	public String findAllToJSON();
	public String findAllToJSON(List<Station> list);
	public Station findById(int id);
	public List<Station> findAllByType(String type);

}
