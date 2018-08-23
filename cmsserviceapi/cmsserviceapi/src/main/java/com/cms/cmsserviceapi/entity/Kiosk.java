package com.cms.cmsserviceapi.entity;

import javax.persistence.CascadeType;
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

@Entity(name="kiosk")
@Table(name="kiosk")
public class Kiosk {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@Column(name="kiosk_name", nullable=false)
	private String kioskName;
	
	@OneToOne
	@JoinColumn(name="printer_id", nullable=false)
	private Printer printerId;
	
	@OneToOne(mappedBy = "kioskId", cascade = CascadeType.ALL, 
    fetch = FetchType.LAZY, optional = false)
	private Facility facility;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKioskName() {
		return kioskName;
	}

	public void setKioskName(String kioskName) {
		this.kioskName = kioskName;
	}

	public Printer getPrinterId() {
		return printerId;
	}

	public void setPrinterId(Printer printerId) {
		this.printerId = printerId;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	
}
