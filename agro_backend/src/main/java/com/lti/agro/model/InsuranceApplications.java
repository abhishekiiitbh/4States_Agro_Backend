package com.lti.agro.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class InsuranceApplications {
	
	
	String name;
	String email;
	String address;
	String cropName;
	String cropType;
	int cultivationArea;
	int year;
	double sumAssured;
	double farmersPrimium;
	double govtsPrimium;
	@Id
	@SequenceGenerator(name="insappSeq", initialValue=9001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="insappSeq")
	int policyNo;
	boolean status;
	
	@OneToOne
	@JoinColumn(name="fId")
	Farmer farmer;
	
	@ManyToOne
	@JoinColumn(name="companyId")
	InsuranceCompanies insurancecompany;
	
	@OneToOne(mappedBy="insuranceapplication",cascade=CascadeType.ALL)
	InsuranceClaim insuranceclaim;
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getCultivationArea() {
		return cultivationArea;
	}

	public void setCultivationArea(int cultivationArea) {
		this.cultivationArea = cultivationArea;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}

	public double getFarmersPrimium() {
		return farmersPrimium;
	}

	public void setFarmersPrimium(double farmersPrimium) {
		this.farmersPrimium = farmersPrimium;
	}

	public double getGovtsPrimium() {
		return govtsPrimium;
	}

	public void setGovtsPrimium(double govtsPrimium) {
		this.govtsPrimium = govtsPrimium;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	
	
	
	
	
	
	
}
