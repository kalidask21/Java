package com.cms.cmsserviceapi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity(name="printer")
@Table(name="printer")
public class Printer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@Column(name="printer_name", nullable=false)
	private String printName;
	
	@OneToOne(mappedBy = "printerId", cascade = CascadeType.ALL, 
    fetch = FetchType.LAZY, optional = false)
	private Kiosk facility;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public Kiosk getFacility() {
		return facility;
	}

	public void setFacility(Kiosk facility) {
		this.facility = facility;
	}
	
}
