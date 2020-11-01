package com.lti.agro.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "agro_insuranceclaim")
public class InsuranceClaim {
	
	@Id
	@SequenceGenerator(name="incsclaimSeq", initialValue=8001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="incsclaimSeq")
	int rId;
	
	@OneToOne
	@JoinColumn(name="policyNo")
	InsuranceApplications insuranceapplication;
	
	
	
	String causeOfClaim;
	LocalDate dateOfLoss;
	LocalDate dateOfClaim;
	LocalDate dateOfApproval;
	
	boolean claimStatus;
	
	public boolean isClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(boolean claimStatus) {
		this.claimStatus = claimStatus;
	}

	double amountClaimed;

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public InsuranceApplications getInsuranceapplications() {
		return insuranceapplication;
	}

	public void setInsuranceapplications(InsuranceApplications insuranceapplication) {
		this.insuranceapplication = insuranceapplication;
	}

	public String getCauseOfClaim() {
		return causeOfClaim;
	}

	public void setCauseOfClaim(String causeOfClaim) {
		this.causeOfClaim = causeOfClaim;
	}

	public LocalDate getDateOfLoss() {
		return dateOfLoss;
	}

	public void setDateOfLoss(LocalDate dateOfLoss) {
		this.dateOfLoss = dateOfLoss;
	}

	public LocalDate getDateOfClaim() {
		return dateOfClaim;
	}

	public void setDateOfClaim(LocalDate dateOfClaim) {
		this.dateOfClaim = dateOfClaim;
	}

	public LocalDate getDateOfApproval() {
		return dateOfApproval;
	}

	public void setDateOfApproval(LocalDate dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}

	public double getAmountClaimed() {
		return amountClaimed;
	}

	public void setAmountClaimed(double amountClaimed) {
		this.amountClaimed = amountClaimed;
	}

	@Override
	public String toString() {
		return "InsuranceClaim [rId=" + rId + ", insuranceapplication=" + insuranceapplication + ", causeOfClaim="
				+ causeOfClaim + ", dateOfLoss=" + dateOfLoss + ", dateOfClaim=" + dateOfClaim + ", dateOfApproval="
				+ dateOfApproval + ", amountClaimed=" + amountClaimed + "]";
	}
	
	
	
	
	
}
