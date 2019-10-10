/*
 * Name: Vikas Reddy
 * Class: Professor Calliss Wednesday 360 class
 * Assignment: #2
 * Description: Simple calculator tied to github repo
*/

package cse360assign2;

//performs simple arithmetic functions and displays them
public class AddingMachine {

	private int total;
	private String allOps;

	//constructor
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		allOps = "0";
	}
	
	//gets the current total
	public int getTotal () {
		return total;
	}
	
	//value is passed in to be added to total
	public void add (int value) {
		total += value;
		allOps = allOps + " + " + value;
	}
	
	//value is passed in to be subtracted from total
	public void subtract (int value) {
		total -= value;
		allOps += " - " + value;
	}
	
	//returns a string of all performed operations
	public String toString () {
		return allOps;
	}
	
	//clears the total field
	public void clear() {
		total = 0;
	}
}
