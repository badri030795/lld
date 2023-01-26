package com.parkinglot.parkinglot.controllers;

import com.parkinglot.parkinglot.dtos.CreateCreateRequestDto;
import com.parkinglot.parkinglot.dtos.CreateCreateResponseDto;
import com.parkinglot.parkinglot.dtos.ReponseStatus;
import com.parkinglot.parkinglot.dtos.ResponseDto;
import com.parkinglot.parkinglot.exception.NoParkingSpotAvailableException;
import com.parkinglot.parkinglot.model.Ticket;
import com.parkinglot.parkinglot.services.TicketService;

public class TicketController {
	TicketService ticketService;

	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	public CreateCreateResponseDto createTicket(CreateCreateRequestDto request) throws NoParkingSpotAvailableException {
		try {
			Ticket ticket = ticketService.createTicket(request.getParkingLot(), request.getGate(),
					request.getVehicle());
			CreateCreateResponseDto response = new CreateCreateResponseDto();
			response.setTicket(ticket);
			return response;
		} catch (NoParkingSpotAvailableException e) {
			CreateCreateResponseDto response = new CreateCreateResponseDto();
			response.setResponseStatus(ReponseStatus.FAILURE);
			return response;
		}
	}
}
