package com.parkinglot.parkinglot;

import java.util.ArrayList;

import com.parkinglot.parkinglot.controllers.ParkingLotController;
import com.parkinglot.parkinglot.controllers.TicketController;
import com.parkinglot.parkinglot.dtos.CreateCreateRequestDto;
import com.parkinglot.parkinglot.dtos.CreateCreateResponseDto;
import com.parkinglot.parkinglot.dtos.CreateParkingLotRequestDto;
import com.parkinglot.parkinglot.dtos.CreateParkingLotResponseDto;
import com.parkinglot.parkinglot.exception.NoParkingSpotAvailableException;
import com.parkinglot.parkinglot.repositories.ParkingLotRepository;
import com.parkinglot.parkinglot.repositories.ParkingSpotRepository;
import com.parkinglot.parkinglot.repositories.TicketRepository;
import com.parkinglot.parkinglot.services.ParkingLotService;
import com.parkinglot.parkinglot.services.TicketService;
import com.parkinglot.parkinglot.strategies.slotAllocation.ParkingSpotStrategy;
import com.parkinglot.parkinglot.strategies.slotAllocation.RandomSpotAllocationStrategy;

public class ClientParkingLotCreation {

	public static void main(String[] args) {
		System.out.println("Hello World");
		ObjectRegistry registry = new ObjectRegistry();

		registry.register("ParkingLotRepository", new ParkingLotRepository());

		registry.register("ParkingLotService",
				new ParkingLotService((ParkingLotRepository) registry.get("ParkingLotRepository")));

		registry.register("ParkingLotController",
				new ParkingLotController((ParkingLotService) registry.get("ParkingLotService")));

		CreateParkingLotRequestDto request = new CreateParkingLotRequestDto();
		request.setAddress(null);
		request.setEntryGates(new ArrayList<>());
		request.setExitGates(new ArrayList<>());
		request.setFloors(new ArrayList<>());

		CreateParkingLotResponseDto response = (((ParkingLotController) registry.get("ParkingLotController"))
				.createParkingLot(request));
	}

}
