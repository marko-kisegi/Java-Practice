package hr.oop.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] elements = {
				"Zagreb", "Vukovar", "Dubrovnik", "Rijeka", "Split", "Pula"
		};
		List<String> cities = new ArrayList<>(Arrays.asList(elements)); //variable compared to Arrays
		System.out.println(cities.get(3) + " " + elements[3]);
		System.out.println(cities);
		cities.set(3, "Vinkovci");
		System.out.println(cities.get(3) + " " + elements[3]);
		System.out.println(cities);
		System.out.println(Arrays.toString(elements));
		cities.remove(3);
		System.out.println(cities);
		System.out.println(Arrays.toString(elements));
	}

}
