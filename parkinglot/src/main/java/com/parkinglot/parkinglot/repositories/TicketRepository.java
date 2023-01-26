package com.parkinglot.parkinglot.repositories;

import java.util.HashMap;
import java.util.Map;

import com.parkinglot.parkinglot.model.Ticket;

public class TicketRepository {

	private Map<Long, Ticket> map = new HashMap<>();

	private Long count = 0L;

	public Ticket save(Ticket ticket) {
		count += 1;
		ticket.setId(count);
		map.put(count, ticket);
		return ticket;
	}

}
