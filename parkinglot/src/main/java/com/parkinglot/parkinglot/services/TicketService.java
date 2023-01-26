package com.parkinglot.parkinglot.services;

import java.sql.Date;

import com.parkinglot.parkinglot.exception.NoParkingSpotAvailableException;
import com.parkinglot.parkinglot.model.Gate;
import com.parkinglot.parkinglot.model.ParkingLot;
import com.parkinglot.parkinglot.model.ParkingSlotSatus;
import com.parkinglot.parkinglot.model.ParkingSpots;
import com.parkinglot.parkinglot.model.Ticket;
import com.parkinglot.parkinglot.model.Vehicle;
import com.parkinglot.parkinglot.repositories.ParkingLotRepository;
import com.parkinglot.parkinglot.repositories.ParkingSpotRepository;
import com.parkinglot.parkinglot.repositories.TicketRepository;
import com.parkinglot.parkinglot.strategies.slotAllocation.ParkingSpotStrategy;
import com.parkinglot.parkinglot.strategies.slotAllocation.RandomSpotAllocationStrategy;

public class TicketService {

	private TicketRepository ticketRepository;
	private ParkingSpotStrategy parkingSpotStrategy;
	private ParkingLotRepository parkingLotRepository;
	private ParkingSpotRepository parkingSpotRepository;

	public TicketService(TicketRepository ticketRepository, ParkingSpotStrategy parkingSpotStrategy,
			ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository) {
		this.parkingLotRepository = parkingLotRepository;
		this.ticketRepository = ticketRepository;
		this.parkingSpotStrategy = parkingSpotStrategy;
		this.parkingSpotRepository = parkingSpotRepository;
	}

	public Ticket createTicket(ParkingLot parkingLot, Gate gate, Vehicle vehicle)
			throws NoParkingSpotAvailableException {

		Ticket ticket = new Ticket();
		ticket.setEntryTime(new Date(0));
		ticket.setOwnerName(gate.getOperator().getName());
		ticket.setEntryGate(gate);
		ticket.setVehicle(vehicle);
		ticket.setParkingLot(parkingLot);

		ParkingSpots parkingSpot = parkingSpotStrategy.assignSpot(parkingLotRepository.getParkingLot(1L),
				vehicle.getType());
		parkingSpot.setSlotStatus(ParkingSlotSatus.OCCUPIED);

		parkingSpotRepository.Save(parkingSpot);

		ticket.setParkingSpot(parkingSpot);

		return ticketRepository.save(ticket);
	}

}
