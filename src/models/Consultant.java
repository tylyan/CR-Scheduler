package models;

import java.util.ArrayList;

public class Consultant {
	
	// fields
	private String netID;
	private Supervisor supervisor;
	private ArrayList<Shift> shifts;
	
	public Consultant(String netID){
		this.netID = netID;
		this.shifts = new ArrayList<Shift>();
	}

	// methods
	public void addShift(Shift shift){
		shifts.add(shift);
	}
	
	public String getNetID() {
		return netID;
	}

	public ArrayList<Shift> getShifts() {
		return shifts;
	}
	
	public String toString(){
		String shiftsString = netID + ":\n";
		for (Shift shift : shifts){
			shiftsString += shift.toString() + "\n";
		}
		shiftsString += "\n";
		return shiftsString;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	
}
