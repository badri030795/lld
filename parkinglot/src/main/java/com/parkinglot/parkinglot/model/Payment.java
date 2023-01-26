package com.parkinglot.parkinglot.model;

import java.sql.Date;

public class Payment extends BaseModel {

	private PaymentStatus status;

	private Bill bill;

	private String refNumber;

	private Date timeOfPayment;

	private double amount;

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public Date getTimeOfPayment() {
		return timeOfPayment;
	}

	public void setTimeOfPayment(Date timeOfPayment) {
		this.timeOfPayment = timeOfPayment;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
