package com.pppcar;

import java.util.Arrays;
import java.util.List;

public class java8 {
	public static void main(String[] args) {
		String[] atp = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
		List<String> players = Arrays.asList(atp);
		players.forEach((player) -> System.out.println(player + "; ")); 
		players.forEach(System.out::printf);

	}

}
