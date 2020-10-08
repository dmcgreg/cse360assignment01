/**
 * CSE 360 Fall 2020 Assignment 1
 * @author Damian McGregor
 * Description:	AddingMachine takes given input values and performs method defined operations,
 * 				including addition, subtraction, provide total, display history, and clear history.
 */

package cse360assignment01;


public class AddingMachine {
	private int total;
	private String history;
	  
	/**
	 * Constructor for AddingMachine class
	 */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  
	  /**
	   * returns current total
	   * @return total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * adds value to total
	   * @param value
	   */
	  public void add (int value) {
		  total += value;
		  history = history + " + " + value;
	  }

	  /**
	   * subtracts value from total
	   * @param value
	   */
	  public void subtract (int value) {
		  total -= value;
		  history = history + " - " + value;
	  }

	  /**
	   * display transaction history
	   * @return history
	   */
	  public String toString () {
	    return history;
	  }

	  /**
	   * clear AddingMachine
	   */
	  public void clear() {
		  total = 0;
		  history = "0";
	  }
}
