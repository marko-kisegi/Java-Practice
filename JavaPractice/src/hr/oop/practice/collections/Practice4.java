package hr.oop.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class Practice4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Jeremy");
		list.add("Susan");
		list.add("Patricia");
		System.out.println(list);
		
		Set<String> letters = new HashSet<>( Arrays.asList("C", "D")); 
		list.addAll(letters);
		System.out.println(list);
		list.addAll(3, letters);
		System.out.println(list);
		
		UnaryOperator<String> f = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
					return t.toUpperCase();	
			}
		};
		list.replaceAll(f);
		System.out.println(list);
		list.replaceAll(t->t.toLowerCase());
		System.out.println(list);
		list.replaceAll(String::toUpperCase);
		System.out.println(list);
		Comparator<String> comp = String::compareTo;
		list.sort(comp);
		System.out.println(list);
		
		list.sort(comp.reversed());
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		List<String> part = list.subList(4, 8);
		System.out.println(part);
		System.out.println(part.get(2));
		part.clear();
		System.out.println(part);
		System.out.println(list);
	}
}
