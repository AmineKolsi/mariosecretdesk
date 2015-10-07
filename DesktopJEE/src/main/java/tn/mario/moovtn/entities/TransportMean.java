package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TransportMean
 *
 */
@Entity

public class TransportMean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String type;
	private String serial;
	private boolean state;
	private Set<Rent> rent;
	
	@OneToMany
	public Set<Rent> getRent() {
		return rent;
	}
	public void setRent(Set<Rent> rent) {
		this.rent = rent;
	}
	public TransportMean() {
		super();
	}   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	
	public boolean getState() {
		return this.state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
   
}
