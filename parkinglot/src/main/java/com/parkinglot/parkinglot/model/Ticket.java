package com.parkinglot.parkinglot.model;

import java.sql.Date;

public class Ticket extends BaseModel {

	private Date entryTime;

	private ParkingSpots parkingSpot;

	private Vehicle vehicle;

	private Operator generatedBy;

	private ParkingLot parkingLot;

	private Gate entryGate;

	private String ownerName;

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public ParkingSpots getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpots parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Operator getGeneratedBy() {
		return generatedBy;
	}

	public void setGeneratedBy(Operator generatedBy) {
		this.generatedBy = generatedBy;
	}

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	public Gate getEntryGate() {
		return entryGate;
	}

	public void setEntryGate(Gate entryGate) {
		this.entryGate = entryGate;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
