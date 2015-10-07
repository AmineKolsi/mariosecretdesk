package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Line
 *
 */
@Entity

public class Line implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Set<Notification> notifications;
	private Set<Trip> trips;
	private List<Station> stations;
	
	@OneToMany(mappedBy="line")
	public Set<Notification> getNotifications() {
		return notifications;
	}
	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}
	
	@OneToMany
	public Set<Trip> getTrips() {
		return trips;
	}
	public void setTrips(Set<Trip> trips) {
		this.trips = trips;
	}
	
	//private List<Users> listUsers;
	

	public Line() {
		super();
	} 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//public List<Users> getListUsers() {
		//return listUsers;
	//}
	//public void setListUsers(List<Users> listUsers) {
		//this.listUsers = listUsers;
	//}
	@ManyToMany
	public List<Station> getStations() {
		return stations;
	}
	public void setStations(List<Station> stations) {
		this.stations = stations;
	}
	
   
}
