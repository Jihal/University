package eecs2030.lab2;

import java.util.Objects;

import javax.print.attribute.standard.MediaSize.Other;

public class Nickel implements Comparable<Nickel> {

	private int year;

	/**
	 * The monetary value of a nickel in cents.
	 */
	public final int CENTS = 5;

	/* 
	 * Initializes this year to have a value of year.
	 * @pre. year greater than or equal to 1858
	 * @param 
	 *      the value of the year
	 * @throws IllegalArgumentException
	 *       If the year is less than 1858 
	 *
	 */
	public Nickel(int year) {
		if (year >= 1858) {
			this.year = year;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/* 
	 * Returns the value of this year.
	 * @return the value of this year
	*/
	public int issueYear() {
		return this.year;
	}
    /* Returns the difference of the issue year of this nickel and the issue year of the other nickel.
     * @return the difference of the issue year of this nickel and the issue year of the other nickel
     */
	public int compareTo(Nickel other) {
		return this.year - other.year;
	}

	@Override
	/* Returns true if the object is a nickel.
	 * @returns true if the object is a nickel
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		return true;

	}

	@Override
	/* Return the issue year of this nickel
	 * @return the issue year of this nickel.

	 */
	public int hashCode() {
		return Objects.hash(this.year);
	}
}
