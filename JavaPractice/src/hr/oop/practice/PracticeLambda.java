package hr.oop.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeLambda {
	public static void main(String[] args) {
		
		List<Double> arr = new ArrayList<> (
				Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0));
		arr.forEach(n->System.out.println(Math.pow(n, 2)));
		arr.forEach(PracticeLambda::Hello);
	}
	public static void Hello(Double n) {
		Double a = Math.pow(n, 2);
		System.out.format("%.0f %.0f \n", n, a);
	}

}
