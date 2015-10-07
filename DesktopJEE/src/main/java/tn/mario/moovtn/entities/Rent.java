package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rent
 *
 */
@Entity

public class Rent implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Timestamp rentStart;
	private Timestamp rentEnd;
	private Location departure;
	private Location destination;
	private TransportMean transportMean;
	
	@ManyToOne
	@JoinColumn(name="idTransportMean")
	public TransportMean getTransportMean() {
		return transportMean;
	}
	public void setTransportMean(TransportMean transportmean) {
		this.transportMean = transportmean;
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Timestamp getRentStart() {
		return rentStart;
	}
	public void setRentStart(Timestamp rentStart) {
		this.rentStart = rentStart;
	}
	public Timestamp getRentEnd() {
		return rentEnd;
	}
	public void setRentEnd(Timestamp rentEnd) {
		this.rentEnd = rentEnd;
	}
	public Location getDeparture() {
		return departure;
	}
	public void setDeparture(Location departure) {
		this.departure = departure;
	}
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}
	









}