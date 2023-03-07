package com.vti.frontend;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo_hashmap {
	public static void main(String[] args) {
		Map<Integer, String> nameHashMap = new HashMap<>();
		nameHashMap.put(1, "hoang");
		nameHashMap.put(2, "hoa");
		for (Entry<Integer, String> name : nameHashMap.entrySet()) {
			System.out.println(name.getKey() + " " + name.getValue());
		}
	}
}
