package com.parkinglot.parkinglot.controllers;

import com.parkinglot.parkinglot.dtos.CreateParkingFloorRequestDto;
import com.parkinglot.parkinglot.dtos.CreateParkingFloorResponseDto;
import com.parkinglot.parkinglot.services.ParkingFloorService;

public class ParkingFloorController {

	private ParkingFloorService parkingFloorService;

	public ParkingFloorController(ParkingFloorService parkingFloorService) {
		this.parkingFloorService = parkingFloorService;
	}

	public CreateParkingFloorResponseDto createParkingFloor(CreateParkingFloorRequestDto request) {
		CreateParkingFloorResponseDto response = new CreateParkingFloorResponseDto();
		response.setFloor(parkingFloorService.createFloor(request.getParkingSpots(), request.getFloorNumber(),
				request.getName()));
		return response;
	}

}
