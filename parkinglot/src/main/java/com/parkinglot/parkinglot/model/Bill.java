package com.parkinglot.parkinglot.model;

import java.sql.Date;
import java.util.List;

public class Bill extends BaseModel {

	private double amount;

	private Ticket ticket;

	private Date exitTime;

	private Operator operator;

	private BillPaidStatus billstatus;

	private List<PaymentType> paymentTypes;

	public Date getExitTime() {
		return exitTime;
	}

	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public BillPaidStatus getBillstatus() {
		return billstatus;
	}

	public void setBillstatus(BillPaidStatus billstatus) {
		this.billstatus = billstatus;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public List<PaymentType> getPaymentTypes() {
		return paymentTypes;
	}

	public void setPaymentTypes(List<PaymentType> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
}
