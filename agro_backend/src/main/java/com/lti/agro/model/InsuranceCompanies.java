package com.lti.agro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "agro_insurancecompany")
public class InsuranceCompanies {
	
	@Id
	@SequenceGenerator(name="insSeq", initialValue=4001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="insSeq")
	int companyId;
	
	@OneToMany(mappedBy="insurancecompany",cascade=CascadeType.ALL)
	List<InsuranceApplications> insuranceapplications;
	
	
	String companyName;
	double sumAssuredPrHectare;
	double interest;
	String cropType;
	String state;
	
	
	
	public List<InsuranceApplications> getInsuranceapplications() {
		return insuranceapplications;
	}
	public void setInsuranceapplications(List<InsuranceApplications> insuranceapplications) {
		this.insuranceapplications = insuranceapplications;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getSumAssuredPrHectare() {
		return sumAssuredPrHectare;
	}
	public void setSumAssuredPrHectare(double sumAssuredPrHectare) {
		this.sumAssuredPrHectare = sumAssuredPrHectare;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "InsuranceCompanies [companyId=" + companyId + ", insuranceapplications=" + insuranceapplications
				+ ", companyName=" + companyName + ", sumAssuredPrHectare=" + sumAssuredPrHectare + ", interest="
				+ interest + ", cropType=" + cropType + ", state=" + state + "]";
	}
	
	
	
	
	
}
