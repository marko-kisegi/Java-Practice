/**
 * 
 */
package hr.oop.practice.swing;

import java.util.Objects;

/**
 * @author Sui146
 *
 */
public class HashAndOtherPractice {
	Double hello = 0.0;

	@Override
	public int hashCode() {
		return Objects.hash(hello);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HashAndOtherPractice)) {
			return false;
		}
		HashAndOtherPractice other = (HashAndOtherPractice) obj;
		return Objects.equals(hello, other.hello);
	}

	/**
	 * @param hello
	 */
	public HashAndOtherPractice(Double hello) {
		super();
		this.hello = hello;
	}

	@Override
	public String toString() {
		return "HashAndOtherPractice [hello=" + hello + "]";
	}

}
