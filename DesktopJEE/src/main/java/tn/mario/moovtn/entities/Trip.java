package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trip
 *
 */
@Entity

public class Trip implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Timestamp departureTime;
	private Timestamp arrivalTime;
	private TransportMean transportMean;
	private String direction;
	private Line line;
	
	
	@ManyToOne
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public Trip() {
		super();
	}   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Timestamp getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}
	public Timestamp getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	@ManyToOne
	public TransportMean getTransportMean() {
		return transportMean;
	}
	public void setTransportMean(TransportMean transportMean) {
		this.transportMean = transportMean;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}   
	
   
}
