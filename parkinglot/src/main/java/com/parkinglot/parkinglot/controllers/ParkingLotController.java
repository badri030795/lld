package com.parkinglot.parkinglot.controllers;

import com.parkinglot.parkinglot.dtos.CreateParkingLotRequestDto;
import com.parkinglot.parkinglot.dtos.CreateParkingLotResponseDto;
import com.parkinglot.parkinglot.services.ParkingLotService;

public class ParkingLotController {

	ParkingLotService parkingLotService;

	public ParkingLotController(ParkingLotService parkingLotService) {
		this.parkingLotService = parkingLotService;
	}

	public CreateParkingLotResponseDto createParkingLot(CreateParkingLotRequestDto request) {
		CreateParkingLotResponseDto response = new CreateParkingLotResponseDto();
		response.setParkingLot(parkingLotService.createParkingLot(request.getFloors(), request.getAddress(),
				request.getEntryGates(), request.getExitGates()));
		return response;
	}

}
