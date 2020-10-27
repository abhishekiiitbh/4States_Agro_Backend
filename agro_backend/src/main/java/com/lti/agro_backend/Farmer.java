package com.lti.agro_backend;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Farmer extends User {
	
	@Id
	@SequenceGenerator(name="farmSeq", initialValue=1001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="farmSeq")
	int fId;// pk
	int area;// hectares
	String landAddress;
	String state;
	int landPincode;
	String certificateNumber;
	
	@OneToMany(mappedBy="farmer",cascade=CascadeType.ALL)
	List<Sales> sales;
	
	@OneToOne(mappedBy="farmer",cascade=CascadeType.ALL)
	InsuranceApplications insuranceapplication;

	
	
	
	public List<Sales> getSales() {
		return sales;
	}
	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getLandAddress() {
		return landAddress;
	}
	public void setLandAddress(String landAddress) {
		this.landAddress = landAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLandPincode() {
		return landPincode;
	}
	public void setLandPincode(int landPincode) {
		this.landPincode = landPincode;
	}
	public String getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	
	
	
}
