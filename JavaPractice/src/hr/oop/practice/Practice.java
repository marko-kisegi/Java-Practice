/**
 * 
 */
package hr.oop.practice;

import java.util.Scanner;

/**
 * @author Korisnik
 *
 */
public class Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("We're adding two numbers.");
		System.out.println("Enter the first number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println(a+b);
		sc.close();
	}

}
