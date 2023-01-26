package com.parkinglot.parkinglot.dtos;

import com.parkinglot.parkinglot.model.Ticket;

public class CreateCreateResponseDto extends ResponseDto {

	private Ticket ticket;

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}
