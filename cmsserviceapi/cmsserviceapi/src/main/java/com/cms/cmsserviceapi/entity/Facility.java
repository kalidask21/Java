package com.cms.cmsserviceapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity(name="facility")
@Table(name="facility")
public class Facility {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@Column(name="facility_name", nullable=false)
	private String facName;
	
	@NotBlank
	@Column(name="facility_loc", nullable=false)
	private String facLocation;
	
	@NotBlank
	@Column(name="facility_zip", nullable=false)
	private String facZip;
	
	@OneToOne(fetch =FetchType.LAZY)
	@JoinColumn(name ="facility_kiosk_id")
	private Kiosk kioskId;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFacName() {
		return facName;
	}


	public void setFacName(String facName) {
		this.facName = facName;
	}


	public String getFacLocation() {
		return facLocation;
	}


	public void setFacLocation(String facLocation) {
		this.facLocation = facLocation;
	}


	public String getFacZip() {
		return facZip;
	}


	public void setFacZip(String facZip) {
		this.facZip = facZip;
	}


	public Kiosk getKioskId() {
		return kioskId;
	}


	public void setKioskId(Kiosk kioskId) {
		this.kioskId = kioskId;
	}

	
}
