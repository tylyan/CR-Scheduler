package app;

import models.Consultant;
import models.Shift;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// choose CSV file
		
		// parse CSV into a data structure (linked list?)
		
		// assign shifts
		Consultant yuky = new Consultant("yuky");
		yuky.addShift(new Shift("ARC", "Monday", null, null));
		System.out.println(yuky);
		// print out resulting schedule
		System.out.println("Normal end.");
	}

}
