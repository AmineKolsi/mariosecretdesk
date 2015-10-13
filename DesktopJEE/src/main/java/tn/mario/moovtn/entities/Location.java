package tn.mario.moovtn.entities;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Location
 *
 */
@Entity

public class Location implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private float latitude;
	private float longitude;
	private String adress;
	
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	
	
	
   
}
