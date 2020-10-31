package com.lti.agro.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Sales {
	
	@Id
	@SequenceGenerator(name="saleSeq", initialValue=3001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="saleSeq")
	int sId;
	String cropName;
	String cropType;
	int quantity;
	boolean soilPhCertificate;
	String fertilizer;
	boolean status;
	boolean sold;
	double basePrice;
	double biddingAmount;
	LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="fId")
	Farmer farmer;
	
	@ManyToOne
	@JoinColumn(name="bId")
	Bidder bidder;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isSoilPhCertificate() {
		return soilPhCertificate;
	}

	public void setSoilPhCertificate(boolean soilPhCertificate) {
		this.soilPhCertificate = soilPhCertificate;
	}

	public String getFertilizer() {
		return fertilizer;
	}

	public void setFertilizer(String fertilizer) {
		this.fertilizer = fertilizer;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getBiddingAmount() {
		return biddingAmount;
	}

	public void setBiddingAmount(double biddingAmount) {
		this.biddingAmount = biddingAmount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}
	
	
	
	
}
