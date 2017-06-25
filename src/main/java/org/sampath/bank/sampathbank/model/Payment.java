package org.sampath.bank.sampathbank.model;

import java.io.Serializable;

/**
 * Created by Jude on 6/24/2017.
 */
public class Payment implements Serializable{

	private String cCNumber = "";
	private String owner = "";
	private Double amount;
	private Integer cvcNumber;

	public String getcCNumber() {
		return cCNumber;
	}

	public void setcCNumber(String cCNumber) {
		this.cCNumber = cCNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getCvcNumber() {
		return cvcNumber;
	}

	public void setCvcNumber(Integer cvcNumber) {
		this.cvcNumber = cvcNumber;
	}
}
