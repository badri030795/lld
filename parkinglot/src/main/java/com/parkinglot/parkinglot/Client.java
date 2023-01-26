package com.parkinglot.parkinglot;

import com.parkinglot.parkinglot.controllers.TicketController;
import com.parkinglot.parkinglot.dtos.CreateCreateRequestDto;
import com.parkinglot.parkinglot.dtos.CreateCreateResponseDto;
import com.parkinglot.parkinglot.exception.NoParkingSpotAvailableException;
import com.parkinglot.parkinglot.repositories.ParkingLotRepository;
import com.parkinglot.parkinglot.repositories.ParkingSpotRepository;
import com.parkinglot.parkinglot.repositories.TicketRepository;
import com.parkinglot.parkinglot.services.TicketService;
import com.parkinglot.parkinglot.strategies.slotAllocation.ParkingSpotStrategy;
import com.parkinglot.parkinglot.strategies.slotAllocation.RandomSpotAllocationStrategy;

public class Client {

	public static void main(String[] args) {
		System.out.println("Hello World");
		ObjectRegistry registry = new ObjectRegistry();

		registry.register("ParkingLotRepository", new ParkingLotRepository());
		registry.register("ParkingSpotRepository", new ParkingSpotRepository());
		registry.register("TicketRepository", new TicketRepository());

		registry.register("ParkingSpotStrategy", new RandomSpotAllocationStrategy());

		registry.register("TicketService",
				new TicketService((TicketRepository) registry.get("TicketRepository"),
						(ParkingSpotStrategy) registry.get("ParkingSpotStrategy"),
						(ParkingLotRepository) registry.get("ParkingLotRepository"),
						(ParkingSpotRepository) registry.get("ParkingSpotRepository")));

		registry.register("TicketController", new TicketController((TicketService) registry.get("TicketService")));

		CreateCreateRequestDto request = new CreateCreateRequestDto();
		request.setGate(null);
		request.setParkingLot(null);
		request.setVehicle(null);

		try {
			CreateCreateResponseDto response = (((TicketController) registry.get("TicketController"))
					.createTicket(request));
		} catch (NoParkingSpotAvailableException e) {
			e.printStackTrace();
		}
	}

}
