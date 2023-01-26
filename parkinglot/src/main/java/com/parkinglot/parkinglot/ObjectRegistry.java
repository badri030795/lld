package com.parkinglot.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {

	private Map<String, Object> objects = new HashMap<>();

	public void register(String name, Object obj) {
		objects.put(name, obj);
	}

	public Object get(String name) {
		return objects.get(name);
	}

}
