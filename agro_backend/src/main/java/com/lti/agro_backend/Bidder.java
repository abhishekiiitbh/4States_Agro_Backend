package com.lti.agro_backend;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
public class Bidder {
//public class Bidder  extends User {
	
	@Id
	@SequenceGenerator(name="bidderSeq", initialValue=2001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bidderSeq")
	int bId;//pk
	
	String traderLicenseNumber;
	
	@OneToMany(mappedBy="bidder",cascade=CascadeType.ALL)
	List<Sales> sales;
	
	
	public List<Sales> getSales() {
		return sales;
	}
	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getTraderLicenseNumber() {
		return traderLicenseNumber;
	}
	public void setTraderLicenseNumber(String traderLicenseNumber) {
		this.traderLicenseNumber = traderLicenseNumber;
	}
	
	
}
