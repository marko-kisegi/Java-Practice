package hr.oop.practice.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prvi pokusaj:");
		System.out.println("-------------");
		ispisi(ukloni1(args));
		System.out.println("Drugi pokusaj:");
		System.out.println("--------------");
		ispisi(ukloni2(args));
		System.out.println("Treci pokusaj:");
		System.out.println("---------------");
		ispisi(ukloni3(args));
	}
	private static Collection<String> ukloni1(String[] args){
		return napuniSkup(args, new HashSet<String>());
	}

	private static Collection<String> ukloni2(String[] args){
		return napuniSkup(args, new TreeSet<String>());
	}

	private static Collection<String> ukloni3(String[] args){
		return napuniSkup(args, new LinkedHashSet<String>());
	}
	
	private static Collection<String> napuniSkup(String[] args, Set<String> stuff){
		for(String s: args) {
			stuff.add(s);
		}
		return stuff;
	}
	public static void ispisi(Collection<String> kolekcija){
		for(String s: kolekcija)
			System.out.println(s);
	}
}