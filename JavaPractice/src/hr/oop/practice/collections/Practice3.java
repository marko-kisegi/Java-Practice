package hr.oop.practice.collections;


import java.util.Collection;
import java.util.HashSet;



public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> retci1 = new HashSet<>() ;
		retci1.add("Harry");
		retci1.add("Mary");
		retci1.add("Sue");
		retci1.add("Francis");
		Collection<String> retci2 = new HashSet<>() ;
		retci2.add("Mary");
		retci2.add("Sue");
		retci2.add("Joshua");
		retci1.removeAll(retci2);
		for(String s: retci1) {
			System.out.println(s);
		}
		
	}

}
