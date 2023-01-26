package com.parkinglot.parkinglot.repositories;

import java.util.ArrayList;
import java.util.List;

import com.parkinglot.parkinglot.model.Gate;

public class GateRepository {

	private List<Gate> gates = new ArrayList<>();

	public List<Gate> getGate() {
		return gates;
	}

}
