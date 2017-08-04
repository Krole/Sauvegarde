package com.sopra.pox3.structure;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapApplication {

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("John", 15);
		map.put("Jim", 10);
		map.put("Robert", 8);
		map.put("Emilie", 17);
		System.out.println(map);

		Player nicolas = new Player();// minuscule à nicolas car variable
		nicolas.name = "Nicolas";
		Player joel = new Player();// il a donc fallu créer les player avant de
									// creer la hashmap (il existe des méthodes
									// + jolies)
		joel.name = "Joel";
		Player amelie = new Player();
		amelie.name = "Amélie";

		TreeMap<Player, Integer> playerScores = new TreeMap<>(); // pour classer par name et pas par hashmap
		playerScores.put(nicolas, 28);
		playerScores.put(joel, 50);
		playerScores.put(amelie, 22);
		System.out.println(playerScores);
		// pour renvoyer un joli tableau, dans le player.java il faut lui
		// préciser le return name et non pas l'adresse du tableau
		
		System.out.println(sortByValue(playerScores));
	}

}
