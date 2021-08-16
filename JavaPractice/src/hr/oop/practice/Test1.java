package hr.oop.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Double> numbers = new ArrayList<>();
		while(true){
			if(sc.hasNextDouble()) {
				numbers.add(sc.nextDouble());
			}
			else {
				String stuff = sc.next();
				if (stuff.equals("quit")){
					break;	
					}			
				else System.out.println("Unknown");
			}		
		}
		sc.close();
		
		OptionalDouble op = average(numbers);
		if(!op.isPresent()){
			System.out.println("You haven't written any numbers.");
			return;
		}
		Double limit = op.getAsDouble()*1.2;
		List<Double> printed = new ArrayList<>();
		for(Double d: numbers) {
			if(d>=limit) printed.add(d);
		}
		printed.sort(Collections.reverseOrder(Double::compareTo));
		printed.forEach(s-> System.out.println(s));;
	}
	private static OptionalDouble average(List<Double> numbers) {
		if(numbers.isEmpty()) {
			return OptionalDouble.empty();
		}
		double sum = 0;
		for(Double d: numbers) {
			sum += d;
		}
		return OptionalDouble.of(sum/(numbers.size()));
		
	}

}
