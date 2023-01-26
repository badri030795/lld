package com.parkinglot.parkinglot.model;

public class Gate extends BaseModel {

	private int gateNumber;

	private GateStatus stautus;

	private GateType type;

	private Operator operator;

	public int getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}

	public GateStatus getStautus() {
		return stautus;
	}

	public void setStautus(GateStatus stautus) {
		this.stautus = stautus;
	}

	public GateType getType() {
		return type;
	}

	public void setType(GateType type) {
		this.type = type;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

}
